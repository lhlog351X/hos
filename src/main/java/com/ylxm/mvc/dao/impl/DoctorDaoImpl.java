package com.ylxm.mvc.dao.impl;

import com.ylxm.mvc.common.RException;
import com.ylxm.mvc.dao.DoctorDao;
import com.ylxm.mvc.entity.Doctor;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lhlog351X
 * com.ylxm.mvc.dao.impl
 * 2023/10/25 0:43
 */
@Component
public class DoctorDaoImpl implements DoctorDao {


    @Autowired
    private  JdbcTemplate jdbcTemplate;
    @Override
    public List<Doctor> dutyDoctors(){
        String sql = "select * from doctor";
        List<Doctor> list ;
        try{
            list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Doctor.class));
            if (list != null){
                return list;
            }
        } catch (Exception e) {
            throw new RException(e.toString());
        }
        return list;
    }
}
