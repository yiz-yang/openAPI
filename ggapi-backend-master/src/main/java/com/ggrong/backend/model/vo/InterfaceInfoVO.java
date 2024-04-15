package com.ggrong.backend.model.vo;


import com.yupi.ggcommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 接口信息封装视图
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo {

    private static final long serialVersionUID = -5446217849059575782L;
    /**
     * 调用次数
     */
    private Integer totalNum;

}
