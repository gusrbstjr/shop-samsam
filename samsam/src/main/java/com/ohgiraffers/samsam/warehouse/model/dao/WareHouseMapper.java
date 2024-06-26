package com.ohgiraffers.samsam.warehouse.model.dao;

import com.ohgiraffers.samsam.warehouse.model.dto.WareHouseDTO;

import com.ohgiraffers.samsam.warehouse.model.dto.WareHouseLogDTO;

import com.ohgiraffers.samsam.warehouse.model.dto.logDTO;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WareHouseMapper {

    List<WareHouseDTO> AllWareHouse(String wareHouse);

    boolean inAndOut(int orderSeq, int quantity);

    int isTrue(int orderSeq);

    int quantityNum(int quantity);

    int changedQuantity(int productSeq, int stockQuantity);

    int insertLog(int productSeq, int status, int productQuantity);


    List<WareHouseLogDTO> AllWareHouseLog(String wareHouseLog);

    List<logDTO> findlogs();
}
