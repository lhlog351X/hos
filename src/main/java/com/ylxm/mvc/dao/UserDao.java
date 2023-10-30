package com.ylxm.mvc.dao;

import com.ylxm.mvc.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author lhlog351X
 * com.ylxm.mvc.dao
 * 2023/10/30 0:13
 */
@Repository
public interface UserDao {

    User login(String account);
}
