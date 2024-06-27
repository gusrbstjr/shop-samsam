package com.ohgiraffers.samsam.shoppingmall.userinterface.purchase.controller;

import com.ohgiraffers.samsam.shoppingmall.userinterface.purchase.model.service.PurchaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Slf4j
@RequestMapping("/purchase")
public class PurchaseController {

    private final PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @PostMapping()
    public String purchaseProduct(@RequestParam int productSeq, @RequestParam int quantity, RedirectAttributes redirectAttributes) {
        try {
            purchaseService.processPurchase(productSeq, quantity);
            redirectAttributes.addFlashAttribute("successMessage", "구매가 성공적으로 완료되었습니다.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("errorMessage", "구매 중 오류가 발생했습니다.");
        }
        return "redirect:/interface/shop-single";
    }
}
