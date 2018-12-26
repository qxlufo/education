package com.quxl.education.sys.controller;

import com.quxl.education.common.returnModel.ResultSet;
import com.quxl.education.common.returnModel.ResultSetService;
import com.quxl.education.sys.bean.RegistMsgEditBean;
import com.quxl.education.sys.entity.SysYh;
import com.quxl.education.sys.service.SysJsService;
import com.quxl.education.sys.service.SysYhService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.sys.controller
 * @date:2018/12/12
 */
@RestController
@RequestMapping("/regist")
public class RegistController {

    @Autowired
    private SysYhService   sysYhService;

    @Autowired
    private SysJsService    sysJsService;

    @RequestMapping("/regist")
    public ModelAndView regist(RegistMsgEditBean bean){
        if(StringUtils.isEmpty(bean.getDlzh())){
            return  new ModelAndView("sys/regist");
        }
        //保存注册用户
       SysYh sysYh = this.sysYhService.saveRegistMessage(bean);
        //保存角色
        this.sysJsService.awardYhJs(sysYh.getYhid(),"临时用户");
        return new ModelAndView("login");
    }

    @RequestMapping("/isRepeatIdCard")
    public ResultSet isRepeatIdCard(String sfzhm){
        if(this.sysYhService.isRepeatIdCard(sfzhm)){
            return ResultSetService.error("身份证号码已被占用");
        }
        return ResultSetService.success("身份证号码可用");
    }
    @RequestMapping("/isRepeatAccount")
    public ResultSet isRepeatAccount(String dlzh){
        if(sysYhService.isRepeatAccount(dlzh)){
            return ResultSetService.error("登录账号已被使用");
        }
        return ResultSetService.success("登录账号可用");
    }

}
