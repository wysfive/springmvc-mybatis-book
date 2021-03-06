package com.ay.dao;

import com.ay.model.AyUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AyUserDao {
    // 实例1: 查询所有的用户列表
    // @Select("select * from ay_user")
    List<AyUser> findAll();

    // List<AyUser> findAll(RowBounds rowBounds);

    /*// 实例2: 查询所有的用户列表
    @Select("select * from ay_user")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "password", property = "password")
    })
    List<AyUser> findAll();*/

    // 实例3: 通过id查询用户
    //@Select("select * from ay_user where id = #{id}")
    AyUser findById(String id);

    // 实例4: 通过用户名查询用户
    //@Select("select * from ay_user where name = #{name}")
    List<AyUser> findByName(String name);

    List<AyUser> findByIds();

    int countByName(String name);

    // 实例1: 插入用户数据
    //@Insert("insert into ay_user(name, password) values(#{name}, #{password})")
    //@Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(AyUser ayUser);

    // 实例2: 更新用户数据
    // @Update("update ay_user set name = #{name}, password = #{password} where id = #{id}")
    int update(AyUser ayUser);

    // 实例3: 根据用户id删除用户
    //@Delete("delete from ay_user where id = #{id}")
    int delete(String id);

    // 实例4: 根据用户名删除用户
    //@Delete("delete from ay_user where name = #{name}")
    int deleteByName(String name);

    /*@Select("select * from ay_user where name = #{name} and password = #{password}")
    List<AyUser> findByNameAndPassword(@Param("name") String name,
                                       @Param("password") String password);*/

    List<AyUser> findByNameAndPassword(Map<String, String> map);

    // 顺序映射
    List<AyUser> findByNameAndPassword2(String name, String password);

    List<AyUser> findByRoleId(String id);
}
