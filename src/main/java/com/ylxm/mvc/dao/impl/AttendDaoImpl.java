package com.ylxm.mvc.dao.impl;

import com.ylxm.mvc.dao.AttendDao;
import com.ylxm.mvc.entity.Attend;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lhlog351X
 * com.ylxm.mvc.dao.impl
 * 2023/10/31 14:02
 */
@Component
@AllArgsConstructor
public class AttendDaoImpl implements AttendDao {

    private final JdbcTemplate jdbcTemplate;


    @Override
    public List<Attend> attendList(long subId) {
        String sql = "select * from attend where doc_id in (select doc_id from doctor where sub_id = " + subId + ")";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Attend.class));
    }
}
