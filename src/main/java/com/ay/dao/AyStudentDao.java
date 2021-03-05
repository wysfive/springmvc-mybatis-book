package com.ay.dao;

import com.ay.model.AyStudent;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 学生DAO接口
 */

public interface AyStudentDao {
    List<AyStudent> findBySchoolId(Integer id);

    AyStudent findById(String id);
}
