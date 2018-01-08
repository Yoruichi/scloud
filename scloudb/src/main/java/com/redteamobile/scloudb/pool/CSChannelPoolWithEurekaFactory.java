package com.redteamobile.scloudb.pool;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by yoruichi on 18/1/4.
 */
@EnableEurekaClient
@Component("COMPUTE-SERVICE")
@Configuration
public class CSChannelPoolWithEurekaFactory extends ChannelPoolWithEurekaFactory {
    @Value("${compute-service}")
    private String serviceName;

    @Override protected String getServiceName() {
        return this.serviceName;
    }
}
