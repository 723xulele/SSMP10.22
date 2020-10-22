package com.qfedu.dao;

import com.qfedu.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author : XuLeLe
 * @Date : 2020/10/22/9:42
 * @Description:
 */
public interface IUserDao {

    //根据uid查找单个user
    User queryById(int uid);
    //获取所有用户对象
    List<User> queryAll();
    //获取部分对象
    List<User> queryAllByLimit(int arg0,int arg1);
    //新增对象
    int insert(User user);
    //修改对象信息
    int update(User user);
    //删除对象
    int deleteById(int uid);

}
