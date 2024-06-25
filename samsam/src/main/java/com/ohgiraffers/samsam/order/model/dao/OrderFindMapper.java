package com.ohgiraffers.samsam.order.model.dao;

import com.ohgiraffers.samsam.order.model.dto.OrderFindDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderFindMapper {

    List<OrderFindDTO> orderFind(String orderName);

}
