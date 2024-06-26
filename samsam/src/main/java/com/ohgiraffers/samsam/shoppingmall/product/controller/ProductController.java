package com.ohgiraffers.samsam.shoppingmall.product.controller;

import com.ohgiraffers.samsam.shoppingmall.product.model.dto.ProductDTO;
import com.ohgiraffers.samsam.shoppingmall.product.model.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
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
    public String registProduct(@ModelAttribute ProductDTO newProduct, RedirectAttributes rttr){

        System.out.println("newProduct ===============> " + newProduct);
        productService.registNewProduct(newProduct);

        rttr.addFlashAttribute("successMessage", "신규 상품 등록에 성공하셨습니다.");
        return "redirect:/product/list";
    }



    @GetMapping("/update/{productSeq}")
    public String updateForm(@PathVariable int productSeq, Model model){
        ProductDTO productDTO = productService.findByProductSeq(productSeq);
        System.out.println("productDTO = " + productDTO);
        model.addAttribute("updateProduct",productDTO);

        return "product/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute ProductDTO updateProduct, RedirectAttributes rttr){

        System.out.println("updateProduct = " + updateProduct);
        updateProduct.setRegisterDate(updateProduct.getRegisterDate().formatted("yyyy-MM-dd"));
        System.out.println("changed value = " + updateProduct);
        productService.update(updateProduct);

        rttr.addFlashAttribute("successMessage","상품 수정에 성공하셨습니다.");

        return "redirect:/product/list";
    }


    @GetMapping("/delete/{productSeq}")
    public String deleteProduct(@PathVariable int productSeq) {
        productService.delete(productSeq);
        return "redirect:/product/list";
    }
}

