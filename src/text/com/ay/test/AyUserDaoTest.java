package com.ay.test;

import com.ay.dao.AyUserDao;
import com.ay.model.AyUser;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户的DAO测试类
 */
public class AyUserDaoTest extends BaseJunit4Test{

    @Resource
    private AyUserDao ayUserDao;

    @Test
    public void testFindAll(){
        List<AyUser> userList = ayUserDao.findAll();
        for(AyUser user : userList){
            System.out.println(user.toString());
        }
    }
}
