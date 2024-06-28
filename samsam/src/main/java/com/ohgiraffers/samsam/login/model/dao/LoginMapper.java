package com.ohgiraffers.samsam.login.model.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface LoginMapper {
    int isLogin(Map<String, String> map);

    String findAccountRoll(String accountId);

    int findSeq(String accountId);
}
