package com.quxl.education.sys.controller;

import com.quxl.education.configger.security.UserTool;
import com.quxl.education.sys.bean.RegistMsgEditBean;
import com.quxl.education.sys.entity.SysYh;
import com.quxl.education.sys.service.SysYhService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.sys.controller
 * @date:2018/12/8
 */
@RestController
public class LoginController {
    @Autowired
    private SysYhService sysYhService;

    @RequestMapping("/login")
    public ModelAndView login(){
            return new ModelAndView("/login");
    }
    @RequestMapping("/loginSuccess")
    public ModelAndView loginSuccess(@AuthenticationPrincipal UserDetails user){
        SysYh sysYh = sysYhService.findByDlzh(user.getUsername());
        UserTool.setUser(sysYh);//将用户信息存放到session 中
        return  new ModelAndView("/sys/main");
    }

}
