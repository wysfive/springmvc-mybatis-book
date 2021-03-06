package com.ay.service.impl;

import com.ay.dao.AyUserDao;
import com.ay.model.AyUser;
import com.ay.service.AyUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AyUserServiceImpl implements AyUserService {

    @Resource
    private AyUserDao ayUserDao;

    /*@Override
    public List<AyUser> findAll() {
        return ayUserDao.findAll();
    }*/

    public List<AyUser> findByNameAndPassword(Map<String, String> map){
        Map<String, String> map1 = new HashMap<>();
        map1.put("name", "a1");
        map1.put("password", "123");
        return ayUserDao.findByNameAndPassword(map1);
    }

    @Override
    public List<AyUser> findAll() {
        return null;
    }

    @Override
    public AyUser findById(String id) {

        return ayUserDao.findById(id);
    }
}
