package com.poojj.funny.service;

import com.poojj.funny.dao.UserDao;
import com.poojj.funny.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public String addUser(User user) {
        int count = userDao.findUsername(user.getUsername().toString());
//        System.out.println("count="+count);
        String massege = "添加成功";
        if (count > 0){
            massege = "用户名已存在";
        }else {
            userDao.save(user);
        }
        return massege;
    }

    @Override
    public String login(User user) {
        int count = userDao.login(user.getUsername().toString(),user.getPassword().toString());
        if (count > 0){
            return "登陆成功";
        }
        return "登录失败";
    }
}
