package com.ohgiraffers.samsam.shoppingmall.userinterface.purchase.model.service;

public interface PurchaseService {
    void processPurchase(int customerSeq, int productSeq, int quantity);
}
