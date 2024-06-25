package com.ohgiraffers.samsam.shoppingmall.product.controller;

import com.ohgiraffers.samsam.shoppingmall.product.model.dto.ProductDTO;
import com.ohgiraffers.samsam.shoppingmall.product.model.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

}

