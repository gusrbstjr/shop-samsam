package com.ohgiraffers.samsam.shoppingmall.userinterface.purchase.controller;

import com.ohgiraffers.samsam.shoppingmall.userinterface.purchase.model.service.PurchaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SessionAttributes("findSeq")
@Controller
@Slf4j
@RequestMapping("/purchase")
public class PurchaseController {

    private final PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @PostMapping()
    public String purchaseProduct(@RequestParam int productSeq, @RequestParam int quantity, Model model, RedirectAttributes redirectAttributes) {
        Integer findSeq = (Integer) model.getAttribute("findSeq");
        if (findSeq == null) {
            redirectAttributes.addFlashAttribute("errorMessage", "사용자 정보가 없습니다.");
            return "redirect:/userinterface/shop-single";
        }

        try {
            purchaseService.processPurchase(findSeq, productSeq, quantity);
            redirectAttributes.addFlashAttribute("successMessage", "구매가 성공적으로 완료되었습니다.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("errorMessage", "구매 중 오류가 발생했습니다.");
        }
        return "redirect:/product/detail/" + productSeq;
    }
}
