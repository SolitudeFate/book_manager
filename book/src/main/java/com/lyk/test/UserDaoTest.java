package com.lyk.test;

import com.lyk.dao.UserDao;
import com.lyk.dao.impl.UserDaoImpl;
import com.lyk.pojo.User;
import org.junit.Test;

public class UserDaoTest {

    @Test
    public void queryUserByUsername() {
        UserDao userDao = new UserDaoImpl();
        if (userDao.queryUserByUsername("admin") == null) {
            System.out.println("用户名可用！");
        } else {
            System.out.println("用户名已存在！");
        }
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        UserDao userDao = new UserDaoImpl();
        if (userDao.queryUserByUsernameAndPassword("admin", "admin1") == null) {
            System.out.println("用户名或密码错误，登录失败！");
        } else {
            System.out.println("查询成功！");
        }
    }

    @Test
    public void saveUser() {
        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao.saveUser(new User(null, "lyk", "ZZYZZY", "jxygzzy@lyk.com")));

    }
}