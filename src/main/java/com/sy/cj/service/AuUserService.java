package com.sy.cj.service;

import com.sy.cj.model.AuUser;

public interface AuUserService {

    AuUser login(String username,String password)throws  Exception;
}
