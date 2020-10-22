package com.qfedu.service;

import com.qfedu.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author : XuLeLe
 * @Date : 2020/10/22/9:48
 * @Description:
 */
public interface IUserService {

    List<User> getAllUsers();

    User queryById(int uid);

    List<User> queryAllByLimit(int arg0,int arg1);

    boolean insert(User user);

    boolean update(User user);

    boolean deleteById(int uid);
}
