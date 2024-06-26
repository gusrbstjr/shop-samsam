package com.ohgiraffers.samsam.main.model.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SaleMapper {
    int revenueMonth();

    int totalSale();

    int customer();

}
