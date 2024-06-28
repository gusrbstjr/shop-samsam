package com.ohgiraffers.samsam.shoppingmall.userinterface.purchase.model.dao;

import com.ohgiraffers.samsam.shoppingmall.userinterface.purchase.model.PurchaseDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PurchaseMapper {

    Integer findProductPriceById(int productSeq);

    void insertPurchase(int customerSeq, int productSeq, int totalAmount, String orderStatus, int quantity);
}
