package com.sy.cj.service;

import com.sy.cj.mapper.AuUserMapper;
import com.sy.cj.model.AuUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuUserServiceImpl implements AuUserService {
    @Autowired
    private AuUserMapper auUserMapper;

    @Override
    public AuUser login(String username, String password) throws Exception {
        AuUser auUser= new AuUser();
        auUser.setUsername(username);
        auUser.setPassword(password);
        Example example= Example.of(auUser);
        List<AuUser> list = auUserMapper.findAll(example);
        return list.get(0);
    }
}
