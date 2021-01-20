package com.sxl.goodgoodsrs.recommend.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sxl.goodgoodsrs.api.model.Recommend;
import com.sxl.goodgoodsrs.common.dao.CommonDao;
import com.sxl.goodgoodsrs.recommend.mapper.RecommendMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("recommendService")
public class RecommendService extends CommonDao {
    @Resource
    private RecommendMapper recommendMapper;
    public Page<Recommend> page(Page query) {
        Page<Recommend> page = PageHelper.startPage(query.getPageNum(), query.getPageSize());
        recommendMapper.page();
        return page;
    }

    public Recommend insertRecommend(Recommend recommend) {
       return recommendMapper.insertRecommend(recommend);
    }


}
