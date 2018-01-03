package com.redteamobile.sclouda.config;

import io.grpc.ServerBuilder;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyServerBuilder;
import org.lognet.springboot.grpc.GRpcServerBuilderConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.net.ssl.SSLException;
import java.io.File;

/**
 * Created by yoruichi on 18/1/3.
 */
@Component
public class MyGRpcServerBuilderConfigurer extends GRpcServerBuilderConfigurer {
    @Value("${grpc.ssl.ca_file}")
    private String caFilePath;
    @Value("${grpc.ssl.key_file}")
    private String keyFilePath;

    @Override public void configure(ServerBuilder<?> serverBuilder) {
        NettyServerBuilder builder = (NettyServerBuilder) serverBuilder;

        try {
            builder.sslContext(
                    GrpcSslContexts.forServer(new File(caFilePath), new File(keyFilePath)).build());
        } catch (SSLException e) {
            e.printStackTrace();
        }

    }
}
