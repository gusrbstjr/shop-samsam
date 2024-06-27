package com.ohgiraffers.samsam.shoppingmall.userinterface.purchase.controller;

import com.ohgiraffers.samsam.shoppingmall.product.model.service.ProductService;
import com.ohgiraffers.samsam.shoppingmall.userinterface.purchase.model.service.PurchaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Slf4j
public class PurchaseController {

    private PurchaseService purchaseService;
    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @PostMapping("/purchase")
    public String purchase(@RequestParam("productSeq") int productSeq, @RequestParam("quantity") int quantity, RedirectAttributes rttr) {
        try {
            purchaseService.processPurchase(productSeq, quantity);
            rttr.addFlashAttribute("successMessage", "구매가 성공적으로 완료되었습니다.");
        } catch (Exception e) {
            rttr.addFlashAttribute("errorMessage", "구매 중 오류가 발생했습니다.");
        }
        return "redirect:/userinterface/changyeon-shop-single";
    }

    @GetMapping("/purchase/main")
    public String main(Model model) {


        return "userinterface/index";
    }

}
