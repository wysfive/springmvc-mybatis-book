package com.ay.dao;

import com.ay.model.AyRole;

public interface AyRoleDao {
    AyRole findById(String id);

    AyRole findByRoleId(String id);
}
