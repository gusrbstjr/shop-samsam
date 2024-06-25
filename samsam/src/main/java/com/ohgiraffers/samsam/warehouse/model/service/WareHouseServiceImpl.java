package com.ohgiraffers.samsam.warehouse.model.service;

import com.ohgiraffers.samsam.warehouse.model.dao.WareHouseMapper;
import com.ohgiraffers.samsam.warehouse.model.dto.WareHouseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class WareHouseServiceImpl implements WareHouseService{

    private final WareHouseMapper wareHouseMapper;

    public WareHouseServiceImpl(WareHouseMapper wareHouseMapper) {
        this.wareHouseMapper = wareHouseMapper;
    }

    @Override
    public List<WareHouseDTO> AllWareHouse(String WareHouse) {
        log.info("[WareHouseImpl] AllMenu menuName {}", WareHouse);
        return wareHouseMapper.AllWareHouse(WareHouse);
    }
}
