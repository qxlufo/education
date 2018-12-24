package com.quxl.education.sys.repository;

import com.quxl.education.common.jdbc.EntityReporitory;
import com.quxl.education.sys.entity.SysYh;

import java.util.List;

/**
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.sys.repository
 * @date:2018/12/12
 */
public interface SysYhRepository extends EntityReporitory<SysYh,Long> {

    List<SysYh> findBySfzhm(String sfzhm);

    List<SysYh> findByDlzh(String dlzh);
}
