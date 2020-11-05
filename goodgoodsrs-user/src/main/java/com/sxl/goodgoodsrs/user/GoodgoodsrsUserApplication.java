package com.sxl.goodgoodsrs.user;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

@SpringBootApplication(exclude =DruidDataSourceAutoConfigure.class )
@MapperScan("com.sxl.goodgoodsrs.user.mapper")

public class GoodgoodsrsUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodgoodsrsUserApplication.class, args);

    }

}

