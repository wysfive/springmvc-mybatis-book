package com.ay.test;

import com.ay.dao.AyUserDao;
import com.ay.model.AyUser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户的DAO测试类
 */
public class AyUserDaoTest extends BaseJunit4Test{

    @Resource
    private AyUserDao ayUserDao;

    /*
    使用RowBounds 逻辑分页,其实就是想把数据全部查出来然后使用想要的数据
    @Test
    public void testFindAll(){
        List<AyUser> userList = ayUserDao.findAll(new RowBounds(0,5));
        for(AyUser user : userList){
            System.out.println(user.toString());
        }
    }*/

    @Test
    public void testFindAll(){
        // startPage(第几页， 多少数据)
        PageHelper.startPage(0, 1);
        // 查询所有用户
        List<AyUser> userList = ayUserDao.findAll();
        // 使用PageInfo对结果进行包装
        PageInfo<AyUser> pageInfo = new PageInfo<>(userList);
    }
}
