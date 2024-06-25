package com.ohgiraffers.samsam.shoppingmall.product.model.service;

import com.ohgiraffers.samsam.shoppingmall.product.model.dao.ProductMapper;
import com.ohgiraffers.samsam.shoppingmall.product.model.dto.ProductDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductDTO> findProductList(String productName) {
        return productMapper.findProductList(productName);
    }

    @Override
    @Transactional
    public void registNewProduct(ProductDTO newProduct) {
        productMapper.registNewProduct(newProduct);
    }

}
