package com.ylxm.mvc.service;

import com.ylxm.mvc.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author lhlog351X
 * com.ylxm.mvc.service
 * 2023/10/30 0:38
 */
@Service
public interface UserService {
    User login(String account);
}
