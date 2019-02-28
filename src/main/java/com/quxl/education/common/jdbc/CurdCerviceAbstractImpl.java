package com.quxl.education.common.jdbc;

import com.quxl.education.common.PageReturn;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaQuery;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.common.jdbc
 * @date:2018/12/9
 */
public abstract class CurdCerviceAbstractImpl<T,ID extends Serializable> implements CurdService<T,ID>{


    @Override
    @Transactional
    public T persist(T e) {
        return getRepository().save(e);
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
        PageRequest pageable = PageRequest.of(page-1,pagesize);
        return getRepository().findAll(pageable);
    }

    @Override
    @Transactional
    public PageReturn findAllByPageCondition(int page, int pagesize, HttpServletRequest request, Class clzz, MyOrder... myOrders){
        PageRequest pageable = PageRequest.of(page-1,pagesize);
        Page<T> p = getRepository().findAll(new MySpecification<T>(request,clzz,myOrders),PageRequest.of(page-1,pagesize));
        return  new PageReturn(p.getTotalElements(),p.getContent());
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
