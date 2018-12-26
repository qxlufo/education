package com.quxl.education.sys.service;

import com.quxl.education.common.jdbc.CurdService;
import com.quxl.education.common.returnModel.ResultSet;
import com.quxl.education.sys.bean.RegistMsgEditBean;
import com.quxl.education.sys.entity.SysYh;

/**
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.sys.service
 * @date:2018/12/12
 */
public interface SysYhService extends CurdService<SysYh,Long> {

    /**
     * 查找系统中是否需已有身份证号
     * @param sfzhm 身份证号
     * @return false:没有重复的  true 有重复的记录
     */
    public boolean isRepeatIdCard(String sfzhm);

    /**
     * 查找系统是否已拥有改登录账号
     * @param dlzh  登录账号
     * @return false:没有重复的  true 有重复的记录
     */
    public boolean isRepeatAccount(String dlzh);

    /**
     * 保存用户注册信息
     * @param bean
     * @return
     */
    public SysYh  saveRegistMessage(RegistMsgEditBean bean);
}
