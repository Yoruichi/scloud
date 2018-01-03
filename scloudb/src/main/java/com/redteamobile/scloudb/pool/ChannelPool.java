package com.redteamobile.scloudb.pool;

import io.grpc.ManagedChannel;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by yoruichi on 17/9/13.
 */
public class ChannelPool extends GenericObjectPool<ManagedChannel> {
    private Logger logger = LoggerFactory.getLogger(ChannelPool.class);

    public ChannelPool(PooledObjectFactory<ManagedChannel> factory,
            GenericObjectPoolConfig config) {
        super(factory, config);
        logger.info("Create pool for class [ManagedChannel].");
    }
}
