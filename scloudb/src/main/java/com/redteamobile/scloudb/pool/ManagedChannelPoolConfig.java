package com.redteamobile.scloudb.pool;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yoruichi on 17/9/13.
 */
@Configuration
@EnableEurekaClient
public class ManagedChannelPoolConfig {
    @Autowired
    private EurekaClient eurekaClient;

    private String ipAddr = "";
    private int port;
    private ChannelPool pool;

    private Logger logger = LoggerFactory.getLogger(ManagedChannelPoolConfig.class);

    @Bean
    public ChannelPool pool() {
        final InstanceInfo instanceInfo =
                eurekaClient.getNextServerFromEureka("compute-service", false);
        String nextIpAddr = instanceInfo.getIPAddr();
        int nextPort = instanceInfo.getPort();
        logger.debug("refresh pool with next server instance on [{}]:[{}].", nextIpAddr, nextPort);
        if (this.ipAddr.equals(nextIpAddr) && this.port == nextPort && this.pool != null)
            return this.pool;

        logger.info(
                "Will generate channel pool factory for next server name [compute-service] on [{}]:[{}]",
                nextIpAddr, nextPort);

        ChannelPoolFactory factory =
                new ChannelPoolFactory(instanceInfo.getIPAddr(), instanceInfo.getPort());
        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        config.setTestOnBorrow(true);
        config.setTestOnCreate(true);
        config.setTestOnReturn(true);
        config.setLifo(true);
        config.setJmxEnabled(false);

        this.pool = new ChannelPool(factory, config);
        this.ipAddr = nextIpAddr;
        this.port = nextPort;

        return this.pool;
    }
}
