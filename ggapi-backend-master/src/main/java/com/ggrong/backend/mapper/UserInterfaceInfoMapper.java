package com.ggrong.backend.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yupi.ggcommon.model.entity.UserInterfaceInfo;


import java.util.List;

public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}