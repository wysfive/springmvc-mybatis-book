package com.ay.dao;

import com.ay.model.AyUserAddress;
import org.springframework.stereotype.Repository;

@Repository
public interface AyUserAddressDao {
    // 根据id查询用户地址
    AyUserAddress findById(Integer id);
}
