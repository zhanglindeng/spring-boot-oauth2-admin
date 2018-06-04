package com.dzlin.oauth2.admin.service;

import com.dzlin.oauth2.admin.entity.AdminUserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class CustomUserDetails implements UserDetails {

    private AdminUserEntity adminUserEntity;

    public CustomUserDetails(AdminUserEntity adminUserEntity) {
        this.adminUserEntity = adminUserEntity;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Admin user authority
        return null;
    }

    @Override
    public String getPassword() {
        return this.adminUserEntity.getPassword();
    }

    @Override
    public String getUsername() {
        return this.adminUserEntity.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.adminUserEntity.getStatus() == 1;
    }
}
