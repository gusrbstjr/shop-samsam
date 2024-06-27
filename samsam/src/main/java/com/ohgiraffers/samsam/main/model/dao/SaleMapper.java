package com.ohgiraffers.samsam.main.model.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SaleMapper {
    Integer revenueMonth();

    Integer totalSale();

    Integer customer();

}
