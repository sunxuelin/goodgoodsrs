package com.sxl.goodgoodsrs.recommend.controller;

import com.github.pagehelper.Page;
import com.sxl.goodgoodsrs.api.model.Recommend;
import com.sxl.goodgoodsrs.common.result.CommonCode;
import com.sxl.goodgoodsrs.common.result.CommonResult;
import com.sxl.goodgoodsrs.common.result.QueryResponseResult;
import com.sxl.goodgoodsrs.recommend.service.RecommendService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class RecommendController {
    @Resource
    private RecommendService recommendService;

    @RequestMapping("/page")
    @ResponseBody
    public QueryResponseResult page(@RequestParam(value = "recommend",required = false)Recommend recommend,
                                    @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                    @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        Page page = recommendService.page(recommend, new Page(pageNum,pageSize));
        return  new QueryResponseResult(CommonCode.SUCCESS,page);
    }

    @RequestMapping("/add")
    public CommonResult add(Recommend recommend) {
        return new CommonResult(CommonCode.SUCCESS, recommendService.insertRecommend(recommend));

    }
}
