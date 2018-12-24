package com.quxl.education.sys.service;

import com.quxl.education.common.jdbc.CurdCerviceAbstractImpl;
import com.quxl.education.common.jdbc.EntityReporitory;
import com.quxl.education.sys.entity.SysJs;
import com.quxl.education.sys.repository.SysJsRespsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.sys.service
 * @date:2018/12/9
 */
@Service
@Transactional

public class SysJsServiceImpl extends CurdCerviceAbstractImpl<SysJs,Long> implements SysJsService{

    @Autowired
    private SysJsRespsitory repository;

    @Override
    public EntityReporitory<SysJs, Long> getRepository() {
        return repository;
    }
}
