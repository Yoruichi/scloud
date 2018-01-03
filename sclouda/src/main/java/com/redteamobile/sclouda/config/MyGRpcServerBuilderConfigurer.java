package com.redteamobile.sclouda.config;

import io.grpc.ServerBuilder;
import io.grpc.netty.NettyServerBuilder;
import org.lognet.springboot.grpc.GRpcServerBuilderConfigurer;

/**
 * Created by yoruichi on 18/1/3.
 */
public class MyGRpcServerBuilderConfigurer extends GRpcServerBuilderConfigurer {
    @Override public void configure(ServerBuilder<?> serverBuilder) {
        NettyServerBuilder builder = (NettyServerBuilder) serverBuilder;
//        builder.sslContext()
    }
}
