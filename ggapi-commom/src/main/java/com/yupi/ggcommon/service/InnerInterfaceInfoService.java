package com.yupi.ggcommon.service;


import com.yupi.ggcommon.model.entity.InterfaceInfo;

/**
* @author m
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-03-25 15:15:14
*/
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、方法、参数）
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path,String method);
}
