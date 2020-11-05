package com.sxl.goodgoodsrs.api.model;

import com.sxl.goodgoodsrs.common.model.CommonModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
/**
 * 评论model
 */
public class commend extends CommonModel {
    private String recommendId;
    private String userId;
    private String commendReply;
}
