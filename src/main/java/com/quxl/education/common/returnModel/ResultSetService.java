package com.quxl.education.common.returnModel;

/**
 * 封装返回成功与否服务类
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.common.returnModel
 * @date:2018/12/20
 */
public  class ResultSetService {

    public static ResultSet success(String message){
        return new ResultSet(ResultSet.SUCCESSCODE,ResultSet.SUCCESSSIGN,message);
    }

    public static ResultSet error(String message){
        return new ResultSet(ResultSet.ERRORCODE,ResultSet.ERRORSIGN,message);
    }

}
