package com.ylxm.mvc.dao.impl;

import com.ylxm.mvc.dao.UserDao;
import com.ylxm.mvc.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @author lhlog351X
 * com.ylxm.mvc.dao.impl
 * 2023/10/30 0:14
 */
@Component
@AllArgsConstructor
public class UserDaoImpl implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public User login(String account) {
        String sql = "select * from user where account = '" +account + "'";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class));
    }
}
