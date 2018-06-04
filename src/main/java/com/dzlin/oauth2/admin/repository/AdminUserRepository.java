package com.dzlin.oauth2.admin.repository;

import com.dzlin.oauth2.admin.entity.AdminUserEntity;
import com.dzlin.oauth2.admin.mapper.AdminUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminUserRepository {

    private AdminUserMapper adminUserMapper;

    @Autowired
    public AdminUserRepository(AdminUserMapper adminUserMapper) {
        this.adminUserMapper = adminUserMapper;
    }

    public AdminUserEntity findByUsername(String username) {
        return this.adminUserMapper.findByUsername(username);
    }
}
