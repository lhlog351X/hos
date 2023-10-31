package com.ylxm.mvc.dao.impl;

import com.ylxm.mvc.dao.SubjectDao;
import com.ylxm.mvc.entity.Subject;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lhlog351X
 * com.ylxm.mvc.dao.impl
 * 2023/10/31 14:56
 */
@Component
@AllArgsConstructor
public class SubjectDaoImpl implements SubjectDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Subject> subjectList() {
        String sql = "select * from subject";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Subject.class));
    }
}
