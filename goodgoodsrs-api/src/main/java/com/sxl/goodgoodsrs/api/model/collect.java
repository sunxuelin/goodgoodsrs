package com.sxl.goodgoodsrs.api.model;

import com.sxl.goodgoodsrs.common.model.CommonModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
/**
 * 收藏model
 */
public class collect extends CommonModel {
    private String recommendId;
}
