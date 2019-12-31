package com.nana.modules.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nana.modules.user.dao.UserDAO;
import com.nana.modules.user.model.User;
import org.springframework.stereotype.Service;

/**
 * @author: GUOYUJUN
 * @time: 2019/12/31 16:06
 * @description:
 */
@Service("userService")
public class UserService extends ServiceImpl<UserDAO, User> implements IService<User> {

}
