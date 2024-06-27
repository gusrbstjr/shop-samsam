package com.ohgiraffers.samsam.order.model.dao;

import com.ohgiraffers.samsam.order.model.dto.OrderChangeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderChangeMapper {
    List<OrderChangeDTO> orderChange();


    OrderChangeDTO findSequence(int ordersequence);

    int changeStatus(int ordersequence);
}
