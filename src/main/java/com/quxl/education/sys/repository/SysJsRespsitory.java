package com.quxl.education.sys.repository;

import com.quxl.education.common.jdbc.EntityReporitory;
import com.quxl.education.sys.entity.SysJs;

import java.util.List;

/**
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.sys.repository
 * @date:2018/12/9
 */
public interface SysJsRespsitory extends EntityReporitory<SysJs,Long> {

    /**
     * 通过角色名称查询得到角色
     * @param mc 角色名称
     * @return
     */
    List<SysJs> findByMc(String mc);
}
