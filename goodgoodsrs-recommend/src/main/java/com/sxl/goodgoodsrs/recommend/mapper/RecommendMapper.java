package com.sxl.goodgoodsrs.recommend.mapper;

import com.github.pagehelper.Page;
import com.sxl.goodgoodsrs.api.model.Recommend;

public interface RecommendMapper {
    Page<Recommend> page();
    Recommend insertRecommend(Recommend recommend);
}
