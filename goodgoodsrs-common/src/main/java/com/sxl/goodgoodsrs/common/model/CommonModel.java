package com.sxl.goodgoodsrs.common.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
@Data
@Setter
@Getter
public class CommonModel implements Serializable {
    public Integer id;
    public Integer createBy;
    public String createName;
    public Date createTime;
}
