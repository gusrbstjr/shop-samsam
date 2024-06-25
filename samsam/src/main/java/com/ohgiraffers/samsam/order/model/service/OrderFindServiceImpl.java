package com.ohgiraffers.samsam.order.model.service;
import com.ohgiraffers.samsam.order.model.dao.OrderFindMapper;
import com.ohgiraffers.samsam.order.model.dto.OrderFindDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class OrderFindServiceImpl implements OrderFindService {

    private final OrderFindMapper orderFindMapper;

    public OrderFindServiceImpl(OrderFindMapper orderFindMapper) {
        this.orderFindMapper = orderFindMapper;
    }

    @Override
    public List<OrderFindDTO> orderFind(String orderName) {
        return orderFindMapper.orderFind(orderName);
    }
}


