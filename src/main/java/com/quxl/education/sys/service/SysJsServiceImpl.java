package com.quxl.education.sys.service;

import com.quxl.education.common.jdbc.CurdCerviceAbstractImpl;
import com.quxl.education.common.jdbc.EntityReporitory;
import com.quxl.education.sys.entity.SysJs;
import com.quxl.education.sys.entity.SysYhjs;
import com.quxl.education.sys.entity.SysYhjsKey;
import com.quxl.education.sys.repository.SysJsRespsitory;
import com.quxl.education.sys.repository.SysYhjsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;


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

    @Autowired
    private SysYhjsRepository sysYhjsRepository;

    @Override
    public EntityReporitory<SysJs, Long> getRepository() {
        return repository;
    }

    @Override
    public boolean awardYhJs(Long yhid, String mc) {
        if(null == yhid && StringUtils.isEmpty(mc)){
            return false;
        }
        List<SysJs> sysJss = repository.findByMc(mc);
        if(sysJss.isEmpty()){
            return false;
        }
        Long jsid = sysJss.get(0).getJsid();
        SysYhjsKey key = new SysYhjsKey();
        key.setYhid(yhid);
        key.setJsid(jsid);
        System.out.println("key");
        this.sysYhjsRepository.save(new SysYhjs(key));
        return true;
    }
}
