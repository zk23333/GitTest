package com.omj.mall.service;

import com.omj.mall.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author Lenovo
 */
public interface UserService {


    public User get(Integer userId);


    public Integer getTotal(User user);
    public boolean add(User user);


    public User login(String userName,String userPassword);
    public boolean update(User user);

}
