package com.ohgiraffers.samsam.login.model.service;

import com.ohgiraffers.samsam.login.model.dao.LoginMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class LoginServiceImpl implements LoginService {
    private final LoginMapper loginMapper;

    public LoginServiceImpl(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    @Override
    public boolean isLogin(String id, String pwd) {
        Map<String, String> map = new HashMap<>();
        map.put("accountId", id);
        map.put("accountPwd", pwd);
        return loginMapper.isLogin(map) == 1;
    }

    @Override
    public String findAccountRoll(String accountId) {
        return loginMapper.findAccountRoll(accountId);
    }

    @Override
    public int findSeq(String username) {
        return loginMapper.findSeq(username);
    }
}
