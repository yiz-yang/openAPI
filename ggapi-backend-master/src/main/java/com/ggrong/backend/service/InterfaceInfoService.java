package com.ggrong.backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.ggcommon.model.entity.InterfaceInfo;


/**
* @author m
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-03-25 15:15:14
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
