package com.ohgiraffers.samsam.shoppingmall.userinterface.purchase.model.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PurchaseMapper {

    Integer findProductPriceById(@Param("productSeq") int productSeq);

    void insertPurchase(@Param("customerSeq") int customerSeq,
                        @Param("productSeq") int productSeq,
                        @Param("totalPrice") int totalPrice,
                        @Param("orderStatus") String orderStatus,
                        @Param("quantity") int quantity);
}
