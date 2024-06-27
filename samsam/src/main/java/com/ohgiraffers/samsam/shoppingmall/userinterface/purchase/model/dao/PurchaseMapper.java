package com.ohgiraffers.samsam.shoppingmall.userinterface.purchase.model.dao;

import com.ohgiraffers.samsam.shoppingmall.userinterface.purchase.model.PurchaseDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PurchaseMapper {
    List<PurchaseDTO> findPurchasesByProduct(int productSeq);


    void updatePurchaseQuantity(int productSeq, int quantity);

    Integer findProductPriceById(@Param("productSeq") int productSeq);

    void updateTotalPurchaseAmount(int productSeq, int totalAmount);

}
