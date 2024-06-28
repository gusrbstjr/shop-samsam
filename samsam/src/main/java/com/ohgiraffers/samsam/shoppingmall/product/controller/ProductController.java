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

    @GetMapping("/main")
    public String mainPage() {
        return "userinterface/index";
    }

    @GetMapping("detail/{productNo}")
    public String detailPage(@PathVariable("productNo") int productNo, Model model) {
        ProductDTO product = productService.findProductDetail(productNo);

        System.out.println("product ========> " + product);
        model.addAttribute("product", product);


        // 데이터베이스에서 product + img_tb 테이블을 조인해서 데이터를 들고오는데
        // 기준은 productNo의 값을 조건절의 값으로 사용
        // 값을 안넘겨도 되니깐 조회하는것만 출력하기

        return "userinterface/shop-single";
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

