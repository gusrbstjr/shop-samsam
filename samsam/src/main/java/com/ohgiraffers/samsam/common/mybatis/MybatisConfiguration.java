package com.ohgiraffers.samsam.common.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ohgiraffers.samsam",annotationClass = Mapper.class)
public class MybatisConfiguration {
    // mapperscan 위치 맞는지 확인 부탁드립니다.
    // 확인부탁
}
