package com.ohgiraffers.samsam.warehouse.model.service;

import com.ohgiraffers.samsam.warehouse.model.dto.WareHouseDTO;
import com.ohgiraffers.samsam.warehouse.model.dto.WareHouseLogDTO;

import java.util.List;

public interface WareHouseService {
    List<WareHouseDTO> AllWareHouse(String wareHouse);

    //boolean inAndOut(int orderSeq, int quantity);

    boolean isTrue(int orderSeq);

    int quantityNum(int quantity);

    int changedQuantity(int orderSeq, int quantity);

    int insertLog(int orderSeq, int status, int quantity);

    List<WareHouseLogDTO> AllWareHouseLog(String stockName);

}
