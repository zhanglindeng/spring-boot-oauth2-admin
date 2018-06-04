package com.dzlin.oauth2.admin.service;

import com.dzlin.oauth2.admin.entity.AdminUserEntity;
import com.dzlin.oauth2.admin.repository.AdminUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private AdminUserRepository adminUserRepository;

    public CustomUserDetailsService(AdminUserRepository adminUserRepository) {
        this.adminUserRepository = adminUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AdminUserEntity user = this.adminUserRepository.findByUsername(username);
        if (user == null) {

            this.logger.warn("username " + username);

            throw new UsernameNotFoundException("user not fond");
        }

        this.logger.info(user.toString());

        return new CustomUserDetails(user);
    }

}
