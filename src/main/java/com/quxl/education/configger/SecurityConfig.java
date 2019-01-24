package com.quxl.education.configger;


import com.quxl.education.configger.security.MyPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.server.authentication.AuthenticationWebFilter;

/**
 * 安全配置类
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.configger
 * @date:2018/12/21
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthenticationSuccessHandler myAuthenticationSuccessHander;

    @Autowired
    private AuthenticationFailureHandler myAuthenticationFailureHander;

    /**
     * 处理密码加密
     * @return
     */
    @Bean
   public PasswordEncoder passwordEncoder(){
        return new MyPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
                .loginPage("/happy/login")//登陆页面
                .loginProcessingUrl("/happy/login")//登陆表单提交Url
                .successHandler(myAuthenticationSuccessHander)//登陆成功调用
                .failureHandler(myAuthenticationFailureHander)//登录失败调用
                .successForwardUrl("/happy/loginSuccess")//登陆成功后调用页面
                .failureUrl("/happy/login")
                //.httpBasic()//弹出式
                .and()
                .authorizeRequests()//授权请求
                .antMatchers("/happy/login","/happy/css/**","/happy/fonts/**","/happy/img/**","/happy/js/**").permitAll()
                .anyRequest() //任何请求
                .authenticated()//都需要身份认证
                .and()
                .csrf().disable()//跨站URL伪造防护关掉
        ;

    }
}



