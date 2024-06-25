package com.ohgiraffers.samsam.warehouse.model.service;

import com.ohgiraffers.samsam.warehouse.model.dto.WareHouseDTO;

import java.util.List;

public interface WareHouseService {
    List<WareHouseDTO> AllWareHouse(String wareHouse);
}
