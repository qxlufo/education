package com.quxl.education.sys.controller;

import com.quxl.education.common.StaticParams;
import com.quxl.education.common.Tool;
import com.quxl.education.sys.entity.SysYh;
import com.quxl.education.sys.service.SysXtqxService;
import com.quxl.education.sys.service.SysYhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
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
    @Autowired
    private SysYhService sysYhService;

    @Autowired
    private SysXtqxService sysXtqxService;

    @RequestMapping("/login")
    public ModelAndView login(){
            return new ModelAndView("/login");
    }
    @RequestMapping("/loginSuccess")
    public ModelAndView loginSuccess(@AuthenticationPrincipal UserDetails user){
        SysYh sysYh = sysYhService.findByDlzh(user.getUsername());
        Tool.setSessionAttribute(StaticParams.USER_SESSION_KEY,sysYh);//将用户信息存放到session 中
        //将目录信息存放到全局变量中
        Tool.setContextAttribute("sysXtqxes",this.sysXtqxService.findcd());


        return  new ModelAndView("/sys/main");
    }

}
