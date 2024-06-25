package com.ohgiraffers.samsam.shoppingmall.product.controller;

import com.ohgiraffers.samsam.shoppingmall.product.model.dto.ProductDTO;
import com.ohgiraffers.samsam.shoppingmall.product.model.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public String findProductList(Model model, @RequestParam(required = false)String productName) {


        List<ProductDTO> productList = productService.findProductList(productName);
        log.info("findProductList: {}", productList);
        model.addAttribute("productList",productList);

        return "product/product";
    }

    @GetMapping("/regist")
    public String registPage() {
        return "product/productRegister";
    }

    @PostMapping("/regist")
    public String registProduct(@ModelAttribute ProductDTO newProduct, RedirectAttributes rttr, Model model){

        System.out.println("newProduct ===============> " + newProduct);
        productService.registNewProduct(newProduct);

        rttr.addFlashAttribute("successMessage", "신규 상품 등록에 성공하셨습니다.");
        return "redirect:/product";
    }

}

