package com.quxl.education.sys.controller;

import com.quxl.education.sys.entity.SysJs;
import com.quxl.education.sys.service.SysJsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.sys.controller
 * @date:2018/12/9
 */
@RestController
@RequestMapping("/sys/js")
public class SysJsController {
    @Autowired
    private SysJsService sysJsService;

    @RequestMapping("/saveSysJs")
    public String saveSysJs(SysJs sysJs){
        if(StringUtils.isEmpty(sysJs)){
            return "error";
        }
        this.sysJsService.getRepository().save(sysJs);

        return "success";
    }
}
