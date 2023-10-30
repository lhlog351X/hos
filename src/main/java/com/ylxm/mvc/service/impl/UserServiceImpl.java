package com.ylxm.mvc.service.impl;

import com.ylxm.mvc.dao.UserDao;
import com.ylxm.mvc.entity.User;
import com.ylxm.mvc.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author lhlog351X
 * com.ylxm.mvc.service.impl
 * 2023/10/30 0:38
 */
@Component
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Override
    public User login(String account) {
        return userDao.login(account);
    }
}
