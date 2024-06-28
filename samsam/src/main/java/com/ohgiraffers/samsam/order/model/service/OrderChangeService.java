package com.ohgiraffers.samsam.order.model.service;

import com.ohgiraffers.samsam.order.model.dto.OrderChangeDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface OrderChangeService {

    List<OrderChangeDTO> orderChange();


    OrderChangeDTO findSequence(int ordersequence);

    int changeStatus(int ordersequence);
}
