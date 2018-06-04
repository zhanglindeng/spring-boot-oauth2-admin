package com.dzlin.oauth2.admin.mapper;

import com.dzlin.oauth2.admin.entity.OauthClientDetailsEntity;
import org.springframework.stereotype.Component;

@Component
public interface OauthClientDetailsMapper {

    OauthClientDetailsEntity findByClientId(String clientId);

    void add(OauthClientDetailsEntity entity);
}
