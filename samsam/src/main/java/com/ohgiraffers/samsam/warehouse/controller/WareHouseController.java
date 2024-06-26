package com.ohgiraffers.samsam.warehouse.controller;

import com.ohgiraffers.samsam.member.Member;
import com.ohgiraffers.samsam.warehouse.model.dto.WareHouseDTO;
import com.ohgiraffers.samsam.warehouse.model.dto.logDTO;
import com.ohgiraffers.samsam.warehouse.model.service.WareHouseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
@RequestMapping

public class WareHouseController {

    private final WareHouseService wareHouseService;
    public WareHouseController(WareHouseService wareHouseService) {
        this.wareHouseService = wareHouseService;
    }
    @GetMapping("goOrderChange")
    public String goOrderChange(){
        return "order/orderChange";
    }

    @GetMapping("goOrderSearch")
    public String goOrderSearch(){
        return "order/orderFind";
    }

    /***
     * 창고 재고조회
     */
    @GetMapping("InAndOut")
    public String inAndOut(Model model) {
        List<logDTO> logs = wareHouseService.findlogs();
        model.addAttribute("logs", logs);
        System.out.println(logs);
        return "warehouse/InAndOut";
    }

/*
        model.addAttribute("WareHouseList", WareHouseList);

            return "/warehouse/list";
        }*/
    @PostMapping("/inAndOut/list")
    public String inAndOutList(Model model, @RequestParam(required = false) int orderSeq, int quantity) {
        log.info("[WareHouseController] inAndOutList orderSeq: {}", orderSeq);
        log.info("[WareHouseController] inAndOutList quantity: {}", quantity);
        boolean isTrue = wareHouseService.isTrue(orderSeq);
        String result = "";
        if(isTrue){
            log.info("[WareHouseController] inAndOutList isTrue: {}", isTrue);
            int status = 2;
            int insertLog = wareHouseService.insertLog(orderSeq, status, quantity);
            int quantityNum = wareHouseService.quantityNum(orderSeq);
            quantity += quantityNum;
            System.out.println(quantity);
            int changedQuantity = wareHouseService.changedQuantity(orderSeq, quantity);
            result = "success";
        }else {

        }
        return "redirect:/InAndOut";
    }


    @PostMapping("/inAndOut/minuslist")
    public String inAndOutMinuslist(Model model, @RequestParam(required = false) int orderSeq, int quantity) {
        boolean isTrue = wareHouseService.isTrue(orderSeq); // 테이블에 있는지 확인
        String result = "";
        if(isTrue){
            log.info("[WareHouseController] inAndOutMinuslist isTrue: {}", isTrue);
            int quantityNum = wareHouseService.quantityNum(orderSeq); // 현재수량
            int status = 4;
            int insertLog = wareHouseService.insertLog(orderSeq, status, quantity);
            quantityNum -= quantity;
            int changedQuantity = wareHouseService.changedQuantity(orderSeq, quantityNum); // 수량 변경
        }else{

        }
        return "redirect:/InAndOut";
    }

    @GetMapping("accountSearch")
    public String accountSearch(){
        return "member/members";
    }
    @GetMapping("email")
    public String email(){
        return "member/mail-form";
    }

    @GetMapping("notice")
    public String notice(){
        return "board/notice";
    }
    @GetMapping("qna")
    public String qna(){
        return "board/QnA";
    }
}