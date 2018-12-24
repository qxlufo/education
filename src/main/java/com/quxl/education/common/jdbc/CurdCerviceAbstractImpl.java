package com.quxl.education.common.jdbc;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import javax.transaction.Transactional;
import java.io.Serializable;

/**
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.common.jdbc
 * @date:2018/12/9
 */
public abstract class CurdCerviceAbstractImpl<T,ID extends Serializable> implements CurdService<T,ID>{


    @Override
    @Transactional
    public void persist(T e) {
        getRepository().save(e);
    }

    @Override
    @Transactional
    public void merge(T e) {
    getRepository().save(e);
    }

    @Override
    @Transactional
    public T findOne(ID id) {
        return getRepository().getOne(id);
    }

    @Override
    @Transactional
    public Page<T> findAllByPage(int page, int pagesize) {
        PageRequest pageable = new PageRequest(page-1,pagesize);
        return getRepository().findAll(pageable);
    }

    @Override
    @Transactional
    public Iterable<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    @Transactional
    public long count() {
        return getRepository().count();
    }

    @Override
    @Transactional
    public void delete(ID id) {
        getRepository().deleteById(id);
    }

    @Override
    public void delete(T t) {
        getRepository().delete(t);
    }


}
