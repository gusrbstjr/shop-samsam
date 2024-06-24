package com.ohgiraffers.samsam.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/***
 * 주문 조회 (배송완료, 결제완료)
 */
@Controller
@Slf4j
public class OrderFindController {
    @GetMapping("OrderFind.html")
    public String orderChange() {
        return "order/OrderFind"; // templates 폴더 안의 OrderChange.html을 렌더링
    }

}
