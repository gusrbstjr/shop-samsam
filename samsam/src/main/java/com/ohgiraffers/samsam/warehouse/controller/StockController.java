package com.ohgiraffers.samsam.warehouse.controller;

import com.ohgiraffers.samsam.warehouse.model.dto.WareHouseDTO;
import com.ohgiraffers.samsam.warehouse.model.dto.WareHouseLogDTO;
import com.ohgiraffers.samsam.warehouse.model.service.WareHouseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
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

        @GetMapping("/warehouseLog/list")
        public String WareHouseLogList(Model model, @RequestParam(required = false) String stockName) {
            System.out.println("=======DEBUG");

            log.info("stockName log: {}", stockName);

            List<WareHouseLogDTO> wareHouseLogList = wareHouseService.AllWareHouseLog(stockName);
            System.out.println("===== get list : " + wareHouseLogList);

            for (WareHouseLogDTO wareHouseLogDTO : wareHouseLogList) {
                if(wareHouseLogDTO.getStatus() == 1) wareHouseLogDTO.setStatusDesc("입고대기");
                else if (wareHouseLogDTO.getStatus() == 2) wareHouseLogDTO.setStatusDesc("입고완료");
                else if (wareHouseLogDTO.getStatus() == 3) wareHouseLogDTO.setStatusDesc("출고대기");
                else if (wareHouseLogDTO.getStatus() == 4) wareHouseLogDTO.setStatusDesc("출고완료");
            }

            model.addAttribute("wareHouseLogList", wareHouseLogList);

            return "warehouse/WareHouseLog";
        }
    }