package com.quxl.education.sys.service;

import com.quxl.education.common.jdbc.CurdCerviceAbstractImpl;
import com.quxl.education.common.jdbc.EntityReporitory;
import com.quxl.education.common.returnModel.ResultSet;
import com.quxl.education.common.returnModel.ResultSetService;
import com.quxl.education.sys.bean.RegistMsgEditBean;
import com.quxl.education.sys.entity.SysYh;
import com.quxl.education.sys.repository.SysYhRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.sys.service
 * @date:2018/12/13
 */
@Service
@Transactional
public class SysYhServiceImpl extends CurdCerviceAbstractImpl<SysYh,Long> implements SysYhService{

    @Autowired
    private SysYhRepository repository;
    @Override
    public EntityReporitory<SysYh, Long> getRepository() {
        return repository;
    }

    @Override
    public boolean isRepeatIdCard(String sfzhm) {
        if(StringUtils.isEmpty(sfzhm)){
            return false;
        }
        List<SysYh> sysYhs = this.repository.findBySfzhm(sfzhm);
        if(sysYhs.size() > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean isRepeatAccount(String dlzh) {
        if(StringUtils.isEmpty(dlzh)){
            return false;
        }
        List<SysYh> sysYhs = this.repository.findByDlzh(dlzh);
        if(sysYhs.size() > 0){
            return true;
        }
        return false;
    }

    @Override
    public SysYh saveRegistMessage(RegistMsgEditBean bean) {
        SysYh sysYh = new SysYh();
        BeanUtils.copyProperties(bean,sysYh);
        sysYh.setJgid(new Long(1));
        sysYh.setMm(DigestUtils.md5DigestAsHex(sysYh.getMm().getBytes()));
        sysYh = this.repository.save(sysYh);
        return sysYh;
    }
}
