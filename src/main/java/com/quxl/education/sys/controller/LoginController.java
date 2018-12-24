package com.quxl.education.sys.controller;

import com.quxl.education.sys.bean.RegistMsgEditBean;
import com.quxl.education.sys.entity.SysYh;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.sys.controller
 * @date:2018/12/8
 */
@RestController
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView login(String account,String password){
        System.out.println("登录页面");
        if(StringUtils.isEmpty(account) || StringUtils.isEmpty(password)){
            return new ModelAndView("/login");
        }
        return  new ModelAndView("sys/main");
    }



}
