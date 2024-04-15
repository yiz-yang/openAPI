package com.yupi.ggcommon.service;


import com.yupi.ggcommon.model.entity.User;


/**
 * 用户服务
 *
 * @author yang
 * @from yang
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配用户秘钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);



}
