package com.ylxm.mvc.dao;

import com.ylxm.mvc.entity.Doctor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lhlog351X
 * com.ylxm.mvc.dao
 * 2023/10/24 19:07
 */
@Repository
public interface DoctorDao {

    List<Doctor> dutyDoctors();
}
