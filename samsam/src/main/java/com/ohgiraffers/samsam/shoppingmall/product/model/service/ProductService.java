package com.ohgiraffers.samsam.shoppingmall.product.model.service;

import com.ohgiraffers.samsam.shoppingmall.product.model.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<ProductDTO> findProductList(String productName);
}
