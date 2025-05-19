package com.enset.ExamElhathat.security;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    // Replace this with real DB logic
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Sample hardcoded user
        if (!username.equals("admin")) {
            throw new UsernameNotFoundException("User not found");
        }

        return new User("admin", new BCryptPasswordEncoder().encode("password"), Collections.emptyList());
    }
}
