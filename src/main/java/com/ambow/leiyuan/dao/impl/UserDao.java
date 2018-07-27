package com.ambow.leiyuan.dao.impl;

import com.ambow.leiyuan.dao.IUserDao;
import com.ambow.leiyuan.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDao implements IUserDao {    //springboot会默认自动将数据源中的配置注入,
    // 用法与hibernate中sessionFactory生成的session类似。以后使用多数据源时会详细解释
    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveOrUpdate(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }
}
