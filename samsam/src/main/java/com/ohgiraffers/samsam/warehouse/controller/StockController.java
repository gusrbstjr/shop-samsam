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
@RequestMapping
@Slf4j

public class StockController {


        private final WareHouseService wareHouseService;

        public StockController(WareHouseService wareHouseService) {
            this.wareHouseService = wareHouseService;
        }


        @GetMapping("/warehouse/list")
        public String WareHouseList(Model model, @RequestParam(required = false) String wharehouseName) {
            System.out.println("=======DEBUG");

            log.info("wharehouseName log: {}", wharehouseName);

            List<WareHouseDTO> warehouseList = wareHouseService.AllWareHouse(wharehouseName);
            System.out.println("===== get list : " + warehouseList);

            model.addAttribute("warehouseList", warehouseList);

            return "warehouse/list";

        }
    }

