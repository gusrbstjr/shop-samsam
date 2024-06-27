package com.ohgiraffers.samsam.order.model.service;

import com.ohgiraffers.samsam.order.model.dao.OrderChangeMapper;
import com.ohgiraffers.samsam.order.model.dto.OrderChangeDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class OrderChangeImpl implements OrderChangeService {

    private final OrderChangeMapper orderChangeMapper;


    public OrderChangeImpl(OrderChangeMapper orderChangeMapper) {
        this.orderChangeMapper = orderChangeMapper;
    }

    @Override
    public List<OrderChangeDTO> orderChange() {
        return orderChangeMapper.orderChange();
    }

    @Override
    public OrderChangeDTO findSequence(int ordersequence) {
        return orderChangeMapper.findSequence(ordersequence);
    }


    @Transactional
    @Override
    public int changeStatus(int ordersequence) {
        return orderChangeMapper.changeStatus(ordersequence);
    }

}
