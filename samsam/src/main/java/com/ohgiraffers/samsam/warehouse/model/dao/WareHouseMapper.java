package com.ohgiraffers.samsam.warehouse.model.dao;

import com.ohgiraffers.samsam.warehouse.model.dto.WareHouseDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WareHouseMapper {
    List<WareHouseDTO> AllWareHouse(String wareHouse);
}
