package com.redteamobile.scloudb.pool;

import com.google.common.base.Strings;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yoruichi on 17/9/13.
 */
@EnableEurekaClient
@Component
public class ChannelPoolFactory {
    @Autowired
    private EurekaClient eurekaClient;

    private String ipAddr = "";
    private String serviceName = "compute-service";
    private int port;
    private ChannelPool pool;
    private String serverId = "";

    private Logger logger = LoggerFactory.getLogger(ChannelPoolFactory.class);

    public ChannelPool makePool() {
        if (!Strings.isNullOrEmpty(this.serverId) && !Strings.isNullOrEmpty(this.ipAddr)
                && this.pool != null && !this.pool.isClosed()) {
            List<InstanceInfo> ins = eurekaClient.getInstancesById(this.serverId);
            if (ins.stream().mapToInt(i -> i.getPort()).filter(p -> p == this.port).count() > 0)
                return this.pool;
        }
        final InstanceInfo instanceInfo =
                eurekaClient.getNextServerFromEureka(serviceName, false);

        String nextServerId = instanceInfo.getId();
        String nextIpAddr = instanceInfo.getIPAddr();
        int nextPort = instanceInfo.getPort();
        logger.debug("refresh makePool with next server instance on [{}]:[{}].", nextIpAddr,
                nextPort);
        if (this.serverId.equals(nextServerId) && this.ipAddr.equals(nextIpAddr)
                && this.port == nextPort && this.pool != null)
            return this.pool;

        logger.info(
                "Will generate channel makePool factory for next server name [compute-service] on [{}]:[{}]",
                nextIpAddr, nextPort);

        ChannelFactory factory =
                new ChannelFactory(instanceInfo.getIPAddr(), instanceInfo.getPort());
        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        config.setTestOnBorrow(true);
        config.setTestOnCreate(true);
        config.setTestOnReturn(true);
        config.setLifo(true);
        config.setJmxEnabled(false);

        if (this.pool != null)
            this.pool.close();

        this.serverId = nextServerId;
        this.pool = new ChannelPool(factory, config);
        this.ipAddr = nextIpAddr;
        this.port = nextPort;

        return this.pool;
    }
}
