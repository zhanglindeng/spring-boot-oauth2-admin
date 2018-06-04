package com.dzlin.oauth2.admin.mapper;

import com.dzlin.oauth2.admin.entity.AdminUserEntity;
import org.springframework.stereotype.Component;

@Component
public interface AdminUserMapper {
    AdminUserEntity findByUsername(String username);
}
