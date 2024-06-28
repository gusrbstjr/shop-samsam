package com.ohgiraffers.samsam.order.controller;

import com.ohgiraffers.samsam.order.model.dto.OrderChangeDTO;
import com.ohgiraffers.samsam.order.model.dto.StockDTO;
import com.ohgiraffers.samsam.order.model.service.OrderChangeService;
import com.ohgiraffers.samsam.order.model.service.OrderFindService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
public class OrderChangeController {

    private final OrderChangeService orderChangeService;
    private int orderSequence = 0;

    public OrderChangeController(OrderChangeService orderChangeService) {
        this.orderChangeService = orderChangeService;
    }

    /**
     * 리스트로 해당하는 list 가져옴
     * @param model
     * @return
     */

    @GetMapping("/orderChange/list")
    public String orderChange(Model model) {

        List<OrderChangeDTO> orderChange = orderChangeService.orderChange();
        System.out.println("orderChange 배송변경 = " + orderChange);

        model.addAttribute("orderList",orderChange);
        return "order/OrderChange"; // templates 폴더 안의 OrderChange.html을 렌더링
    }

    /***
     *  주문 시퀀스 번호를 입력해서 가져옴
     */

    @GetMapping("/orderChangeSelect/detail/{ordersequence}")
    public String findSequence(Model model ,@PathVariable int ordersequence){

        System.out.println("=====================ordersequence====================== " + ordersequence);
        this.orderSequence = ordersequence;
        OrderChangeDTO order = orderChangeService.findSequence(ordersequence);
        System.out.println("orderChangeList 바뀐 값= " + order);

        model.addAttribute("detail",order);
        return "order/OrderChangeSelect";
    }
    /***
     * 주문상태변경
     */
//    @PostMapping("/orderChangeSelect/detail/{ordersequence}")
//    public String changeStatus(Model model ,@PathVariable int ordersequence ){
//
//        System.out.println("update 수정 입니다.!!!ordersequence = " + ordersequence);
//        OrderChangeDTO status = orderChangeService.changeStatus(ordersequence);
//        System.out.println("현재 상태ㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐstatus = " + status);
//
//        model.addAttribute("status",status);
//        return "order/OrderChangeStatus";
//    }

    @PostMapping("/orderChangeSelect")
    public String orderChangeStatus(){
        int num = orderChangeService.changeStatus(this.orderSequence);
        System.out.println("작동");
        orderSequence = 0;
        return "redirect:/orderChange/list";
    }
}

