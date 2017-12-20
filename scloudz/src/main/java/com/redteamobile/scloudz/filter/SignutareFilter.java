package com.redteamobile.scloudz.filter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.base.Strings;
import com.google.common.hash.Hashing;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.redteamobile.scloudz.model.page.ResponseStruct;
import com.redteamobile.scloudz.util.DateUtils;
import com.redteamobile.scloudz.util.NumberUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by yoruichi on 17/4/27.
 */
public class SignutareFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(SignutareFilter.class);

    @Override public String filterType() {
        return "pre";
    }

    @Override public int filterOrder() {
        return 0;
    }

    @Override public boolean shouldFilter() {
        return true;
    }

    @Override public Object run() {
        RequestContext rc = RequestContext.getCurrentContext();
        HttpServletRequest request = rc.getRequest();
        String body = null;
        BodyReaderHttpServletRequestWrapper requestWrapper = null;
        try {
            requestWrapper = new BodyReaderHttpServletRequestWrapper(request);
        } catch (IOException e) {
            logger.error("Cloud not create {} request {} wrapper.Caused by:", request.getMethod(),
                    request.getRequestURL(), e);
            e.printStackTrace();
        }
        if (requestWrapper == null) {
            ResponseStruct rs =
                    ResponseStruct.build().setCode("002").setMsg("not valid request");
            try {
                rc.setSendZuulResponse(false);
                rc.setResponseBody(new ObjectMapper().writeValueAsString(rs));
            } catch (JsonProcessingException e) {
                logger.error("Error when processing json from {} in response. Caused by:", rs,
                        e);
            }
        } else {
            body = requestWrapper.getBodyAsString();
            logger.info("Request received body :{}", body);
            long reqTimestamp = 0l;
            try {
                JsonNode reqTime = new ObjectMapper().readTree(body).get("current_time");
                reqTimestamp =
                        NumberUtils.parseLong(reqTime == null ? "0" : reqTime.asText(), 0);
            } catch (Exception e) {
                logger.error("Not valid json data in request, body received :{} ", body);
            }

            logger.info("Request {} received at {} and send at {}", request,
                    DateUtils.format(DateUtils.getCurrentDateTime().toDate()),
                    DateUtils.format(new DateTime(reqTimestamp).toDate()));
//            if (reqTimestamp - System.currentTimeMillis() > 10 * 60 * 1000
//                    || System.currentTimeMillis() - reqTimestamp > 10 * 60 * 1000) {
//                ResponseStruct rs =
//                        ResponseStruct.build().setCode("000").setMsg("not valid request time");
//                try {
//                    rc.setSendZuulResponse(false);
//                    rc.setResponseBody(new ObjectMapper().writeValueAsString(rs));
//                } catch (JsonProcessingException e) {
//                    logger.error("Error when processing json from {} in response. Caused by:", rs,
//                            e);
//                }
//                return null;
//            }
//            String signatureExcepted =
//                    Hashing.sha1().newHasher().putString(body, Charsets.UTF_8).hash()
//                            .toString();
//            String signature = request.getHeader("signature");
//            logger.info("Request {} excepted sign {} but got {}", request, signatureExcepted,
//                    signature);
//            if (Strings.isNullOrEmpty(signature) || !signature.equals(signatureExcepted)) {
//                ResponseStruct rs =
//                        ResponseStruct.build().setCode("001").setMsg("not valid request signature");
//                try {
//                    rc.setSendZuulResponse(false);
//                    rc.setResponseBody(new ObjectMapper().writeValueAsString(rs));
//                } catch (JsonProcessingException e) {
//                    logger.error("Error when processing json from {} in response. Caused by:", rs,
//                            e);
//                }
//                return null;
//            }
        }
        return null;
    }
}
