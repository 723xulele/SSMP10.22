package com.qfedu.controller;

import com.qfedu.entity.User;
import com.qfedu.service.IUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author : XuLeLe
 * @Date : 2020/10/22/9:53
 * @Description:
 */
@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("getAllUsers")
    public List<User> getAllUsers(){

        return userService.getAllUsers();
    }

    @GetMapping("queryById/{uid}")
    public User queryById(@PathVariable("uid") int uid){
        return userService.queryById(uid);
    }

    @GetMapping("queryAllByLimit/{arg0}/{arg1}")
    public List<User> queryAllByLimit(@PathVariable("arg0") int arg0, @PathVariable("arg1") int arg1){
        return this.userService.queryAllByLimit(arg0,arg1);
    }

    @PostMapping("insert")
    public boolean insert(User user){
        return userService.insert(user);
    }

    @PostMapping("update")
    public boolean update(User user){
        return userService.update(user);
    }

    @GetMapping("deleteById/{uid}")
    public boolean deleteById(@PathVariable("uid") int uid){
        return userService.deleteById(uid);
    }


}
