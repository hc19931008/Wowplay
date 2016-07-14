package com.xtkj.wowplay.dao;


import com.xtkj.wowplay.dao.impl.BaseDaoImpl;
import com.xtkj.wowplay.entity.Sort;
import com.xtkj.wowplay.entity.Tag;
import org.aspectj.apache.bcel.util.ClassPath;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by Administrator on 2016/7/12 0012.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-hibernate.xml","classpath:spring-beans.xml"})
@Transactional//这个非常关键，如果不加入这个注解配置，事务控制就会完全失效！
//事务关联到配置文件中的事务控制器（transactionManager = "transactionManager"），同时指定自动回滚（defaultRollback = true）。这样做操作的数据才不会污染数据库！
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class BaseDaoTest {

    @Autowired
    BaseDao baseDao;

    @Test
    public void save() throws Exception {
        Tag tag = new Tag();
        tag.setName("aa");
        baseDao.save(tag);
        System.out.println(baseDao.countAll(Tag.class.getName()));
    }
    @Test
    public void listAll() throws Exception {

        List<Object> list = baseDao.listAll(Sort.class.getName());
        System.out.println(list.size());


    }



}