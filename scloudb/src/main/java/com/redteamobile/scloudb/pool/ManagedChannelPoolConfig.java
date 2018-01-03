package com.redteamobile.scloudb.pool;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    @Value("${grpc.ssl.ca_file}")
    private String caFilePath;

    @Bean
    public ChannelPool pool() {
        final InstanceInfo instanceInfo =
                eurekaClient.getNextServerFromEureka("compute-service", false);
        ChannelPoolFactory factory =
                new ChannelPoolFactory(instanceInfo.getIPAddr(), instanceInfo.getPort(), this.caFilePath);
        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        config.setTestOnBorrow(true);
        config.setTestOnCreate(true);
        config.setTestOnReturn(true);
        config.setLifo(true);
        config.setJmxEnabled(false);

        return new ChannelPool(factory, config);
    }
}
