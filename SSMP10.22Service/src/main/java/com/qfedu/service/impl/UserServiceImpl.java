package com.qfedu.service.impl;

import com.qfedu.dao.IUserDao;
import com.qfedu.entity.User;
import com.qfedu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author : XuLeLe
 * @Date : 2020/10/22/9:50
 * @Description:
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public List<User> getAllUsers() {

        return userDao.queryAll();
    }

    @Override
    public User queryById(int uid) {
        return userDao.queryById(uid);
    }

    @Override
    public List<User> queryAllByLimit(int arg0, int arg1) {
        return userDao.queryAllByLimit(arg0,arg1);
    }

    @Override
    public boolean insert(User user) {
        return userDao.insert(user) > 0;
    }


    @Override
    public boolean update(User user) {
        return userDao.update(user) > 0;
    }

    @Override
    public boolean deleteById(int uid) {
        return userDao.deleteById(uid) > 0;
    }

}
