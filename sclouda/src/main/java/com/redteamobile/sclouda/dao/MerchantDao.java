package com.redteamobile.sclouda.dao;

import com.redteamobile.mis.BaseDao;
import com.redteamobile.sclouda.model.entity.Merchant;
import org.springframework.stereotype.Repository;

@Repository
public class MerchantDao extends BaseDao<Merchant> {

    @Override
    protected Class<Merchant> getEntityClass() {
        return Merchant.class;
    }
}
