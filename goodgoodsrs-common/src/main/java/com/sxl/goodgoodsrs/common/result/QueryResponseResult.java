package com.sxl.goodgoodsrs.common.result;

import com.github.pagehelper.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class QueryResponseResult extends ResponseResult {

    QueryResult queryResult;
    Page page;


    public QueryResponseResult(ResultCode resultCode,QueryResult queryResult){
        super(resultCode);
       this.queryResult = queryResult;
    }

    public QueryResponseResult(CommonCode resultCode, Page dataPage) {
        super(resultCode);
        this.page = dataPage;
    }
}
