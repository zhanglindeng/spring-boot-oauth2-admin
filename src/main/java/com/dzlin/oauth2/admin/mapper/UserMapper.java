package com.dzlin.oauth2.admin.mapper;

import com.dzlin.oauth2.admin.entity.UserEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public interface UserMapper {
    UserEntity findByUsername(String username);

    Long add(UserEntity userEntity);

    UserEntity findById(Long id);

    Long grantAuthority(HashMap<String, Object> params);
}
