package com.ay.dao;

import com.ay.model.AySchool;
import org.springframework.stereotype.Repository;


public interface AySchoolDao {

    AySchool findById(String id);
}
