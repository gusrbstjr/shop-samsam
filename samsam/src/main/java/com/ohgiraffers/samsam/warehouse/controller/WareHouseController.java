/*
package com.ohgiraffers.samsam.warehouse.controller;

import com.ohgiraffers.samsam.warehouse.model.dto.WareHouseDTO;
import com.ohgiraffers.samsam.warehouse.model.service.WareHouseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Slf4j
@RequestMapping

@Slf4j
public class WareHouseController {

    private final WareHouseService wareHouseService;
    public WareHouseController(WareHouseService wareHouseService) {
        this.wareHouseService = wareHouseService;
    }
    */
/***
     * 창고 재고조회
     *//*

    @GetMapping("InAndOut.html")
    public String inAndOut() {
        return "warehouse/InAndOut";
    }

}

    @GetMapping("/list")
    public String list(Model model, @RequestParam(required = false) String WareHouse) {
        log.info("[WareHouseController] list WareHouse: {}", WareHouse);
        List<WareHouseDTO> WareHouseList = wareHouseService.AllWareHouse(WareHouse);
        log.info("[WareHouseController] list===============\n {}", WareHouseList);

        model.addAttribute("WareHouseList", WareHouseList);

        return "/warehouse/list";
    }
}*/
