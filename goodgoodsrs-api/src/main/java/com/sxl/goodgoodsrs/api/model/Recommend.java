package com.sxl.goodgoodsrs.api.model;

import com.sxl.goodgoodsrs.common.model.CommonModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
/**
 * 推荐model
 */
public class Recommend extends CommonModel {
    //标题
    private String title;
    //内容
    private String content;
    //收藏量
    private Integer collectCount;
    //评论量
    private Integer commendCount;
    //喜欢量
    private Integer likeCount;
}
