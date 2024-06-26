package com.ohgiraffers.samsam.shoppingmall.product.model.service;

import com.ohgiraffers.samsam.shoppingmall.product.model.dto.ProductDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface ProductService {


    List<ProductDTO> findProductList(String productName);

    void registNewProduct(ProductDTO newProduct);

    ProductDTO findByProductSeq(int productSeq);

    void update(ProductDTO updateProduct);


    void delete(int productSeq);
}
