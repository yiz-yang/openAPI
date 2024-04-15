package com.ggrong.backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ggrong.backend.exception.BusinessException;
import com.ggrong.backend.exception.ThrowUtils;
import com.ggrong.backend.mapper.InterfaceInfoMapper;
import com.ggrong.backend.service.InterfaceInfoService;
import com.ggrong.backend.common.ErrorCode;
import com.yupi.ggcommon.model.entity.InterfaceInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author m
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2024-03-25 15:15:14
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，参数不能为空
        if (add) {
            ThrowUtils.throwIf(StringUtils.isAnyBlank(name), ErrorCode.PARAMS_ERROR);
        }
        // 有参数则校验
        if (StringUtils.isNotBlank(name) && name.length() >50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }


}




