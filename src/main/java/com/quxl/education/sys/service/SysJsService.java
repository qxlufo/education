package com.quxl.education.sys.service;

import com.quxl.education.common.jdbc.CurdService;
import com.quxl.education.sys.entity.SysJs;

import java.util.List;

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

    /**
     * 用过用户Id 获得权限列表
     * @param yhid
     * @return
     */
    public List<SysJs> fingSysJsBySysYhId(Long yhid);

    /**
     * 用过用户Id 获得权限字符串（用“,”分割）
     * @param yhid
     * @return
     */
    public String fingSysJsStrBySysYhId(Long yhid);
}
