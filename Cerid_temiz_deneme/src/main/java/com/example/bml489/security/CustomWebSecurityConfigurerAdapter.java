package com.example.bml489.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.servlet.http.HttpSessionListener;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class CustomWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter implements HttpSessionListener {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off

        //http.csrf().disable().httpBasic().and().authorizeRequests().anyRequest().authenticated(); signin izin vermiyor
        http.csrf().disable().httpBasic();
        //http..and().authorizeRequests().anyRequest().authenticated(); random kişi login olabiliyor
    }

}