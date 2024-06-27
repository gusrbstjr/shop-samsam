package com.ohgiraffers.samsam.shoppingmall.userinterface.purchase.model.service;

import org.springframework.stereotype.Service;

@Service
public interface PurchaseService {

    void processPurchase(int productSeq, int quantity);

}
