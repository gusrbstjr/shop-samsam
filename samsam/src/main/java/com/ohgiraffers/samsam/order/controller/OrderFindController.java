package com.ohgiraffers.samsam.order.controller;

import com.ohgiraffers.samsam.order.model.dto.OrderFindDTO;
import com.ohgiraffers.samsam.order.model.service.OrderFindService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/***
 * 주문 조회 (배송완료, 결제완료)
 */
@Controller
@Slf4j

public class OrderFindController {
    private final OrderFindService orderFindService;

    public OrderFindController(OrderFindService orderFindService) {
        this.orderFindService = orderFindService;
    }

    /***
     * 주문 입력(결제완료, 발송완료)
     * 주문 찾기
     * @return
     */


    @GetMapping("/order/list")
    public String orderFind(Model model, @RequestParam(required = false) String orderName) {

        log.info("orderName log: {}", orderName);

        List<OrderFindDTO> orderList = orderFindService.orderFind(orderName);
        System.out.println("===== get list : " + orderList);

        model.addAttribute("orderList", orderList);
        return "order/OrderFind"; // 이 경로가 templates/order/OrderFind.html을 가리킴
    }

}
