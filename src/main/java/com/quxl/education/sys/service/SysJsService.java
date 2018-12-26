package com.quxl.education.sys.service;

import com.quxl.education.common.jdbc.CurdService;
import com.quxl.education.sys.entity.SysJs;

/**
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.sys.service
 * @date:2018/12/9
 */
public interface SysJsService extends CurdService<SysJs,Long> {

    /**
     * 给用户赋予角色
     * @param yhid 用户Id
     * @param mc 角色名称
     * @return true 成功，false 失败
     */
    public boolean awardYhJs(Long yhid,String mc);
}
