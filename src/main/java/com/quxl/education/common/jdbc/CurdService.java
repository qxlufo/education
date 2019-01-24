package com.quxl.education.common.jdbc;

import org.springframework.data.domain.Page;

import javax.transaction.Transactional;
import java.io.Serializable;

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

}
