package com.ambow.leiyuan.springbootssh;

import com.ambow.leiyuan.dao.IUserDao;
import com.ambow.leiyuan.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootsshApplicationTests {

    @Autowired
    private IUserDao userDao;

    @Test
    public void contextLoads() {
        User user = new User("leiyuan", "15326047083", "123123", "男", "1996。4。3", "计算机", 0);
        userDao.saveOrUpdate(user);
    }

}
