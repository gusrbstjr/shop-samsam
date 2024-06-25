package com.ohgiraffers.samsam.login.model.service;

import com.ohgiraffers.samsam.login.model.dao.loginMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class loginServiceImpl implements loginService {
    private final loginMapper loginMapper;

    public loginServiceImpl(com.ohgiraffers.samsam.login.model.dao.loginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    @Override
    public boolean isLogin(String id, String pwd) {
        Map<String, String> map = new HashMap<>();
        map.put("accountId", id);
        map.put("accountPwd", pwd);
        return loginMapper.isLogin(map) == 1 ? true : false;
    }

    @Override
    public String findAccountRoll(String accountId) {
        return loginMapper.findAccountRoll(accountId);
    }
}
