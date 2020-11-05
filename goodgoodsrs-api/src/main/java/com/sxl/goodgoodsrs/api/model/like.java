package com.sxl.goodgoodsrs.api.model;

import com.sxl.goodgoodsrs.common.model.CommonModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
/**
 * 喜欢model
 */
public class like extends CommonModel {
    private String recommend_id;
}
