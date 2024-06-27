package com.ohgiraffers.samsam.main.model.service;
import com.ohgiraffers.samsam.main.model.dao.SaleMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SaleImpl implements SaleService {

    private final SaleMapper saleMapper;

    public SaleImpl(SaleMapper saleMapper) {
        this.saleMapper = saleMapper;
    }

    @Override
    public Integer revenueMonth() {
        return saleMapper.revenueMonth();
    }

    @Override
    public Integer totalSale() {
        return saleMapper.totalSale();
    }

    @Override
    public Integer customer() {
        return saleMapper.customer();
    }

}
