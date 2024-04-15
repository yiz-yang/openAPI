package com.yupi.ggcommon.service;

/**
* @author m
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-03-26 14:23:58
*/
public interface InnerUserInterfaceInfoService{


    boolean invokeCount(long interfaceInfoId, long userId);

}
