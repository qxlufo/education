package com.quxl.education.common.jdbc;

import com.quxl.education.common.PageReturn;
import org.springframework.data.domain.Page;

import javax.persistence.criteria.CriteriaQuery;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * 服务层公用的方法抽象
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.common.jdbc
 * @date:2018/12/9
 */
public interface CurdService<T_Entity,ID extends Serializable> {

    public EntityReporitory<T_Entity, ID> getRepository();

    @Transactional
    public T_Entity persist(T_Entity e);

    @Transactional
    public void merge(T_Entity e);

    @Transactional
    public T_Entity findOne(ID id);

    @Transactional
    public Page<T_Entity> findAllByPage(int page, int pagesize);

    @Transactional
    public Iterable<T_Entity> findAll();

    @Transactional
    public long count();

    @Transactional
    public void delete(ID id);

    @Transactional
    public void delete(T_Entity entity);

    @Transactional
    public PageReturn findAllByPageCondition(int page, int pagesize, HttpServletRequest request, Class clzz, MyOrder... myOrders);

}
