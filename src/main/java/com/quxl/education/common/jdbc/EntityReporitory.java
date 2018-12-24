package com.quxl.education.common.jdbc;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * 封装实体类集成的jpa接口
 *
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.common.jdbc
 * @date:2018/12/9
 */
@NoRepositoryBean
public interface EntityReporitory<T,ID extends Serializable> extends JpaRepository<T,ID>, JpaSpecificationExecutor<T> {


}
