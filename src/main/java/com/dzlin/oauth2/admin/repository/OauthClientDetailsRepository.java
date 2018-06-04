package com.dzlin.oauth2.admin.repository;

import com.dzlin.oauth2.admin.entity.OauthClientDetailsEntity;
import com.dzlin.oauth2.admin.mapper.OauthClientDetailsMapper;
import org.springframework.stereotype.Service;

@Service
public class OauthClientDetailsRepository {

    private OauthClientDetailsMapper oauthClientDetailsMapper;

    public OauthClientDetailsRepository(OauthClientDetailsMapper oauthClientDetailsMapper) {
        this.oauthClientDetailsMapper = oauthClientDetailsMapper;
    }

    public void add(OauthClientDetailsEntity entity) {
        this.oauthClientDetailsMapper.add(entity);
    }

    public OauthClientDetailsEntity findByClientId(String clientId) {
        return this.oauthClientDetailsMapper.findByClientId(clientId);
    }

}
