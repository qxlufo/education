package com.quxl.education.configger;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 安全配置类
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.configger
 * @date:2018/12/21
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    /**
     * 自定义配 置
     */
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
//        System.out.println("进入自定义配置");
//        http.
//                authorizeRequests()
//                .antMatchers("/happy/login","/happy/css/***","/happy/js/***","/happy/fonts/***","/happy/img/***").permitAll() //访问 /login无需登陆认证权限
//                .anyRequest().authenticated() //其他所有资源都需要认证，登陆后访问
//                .and()
//                .formLogin()   //需要登陆时
//                .loginPage("/happy/login") //需要登陆时进入到登录页面
//                .permitAll()  //全部可以访问
//                .failureUrl("/happy/login");
    }


}

