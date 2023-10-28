package com.ylxm.mvc.service.impl;

import com.ylxm.mvc.dao.DoctorDao;
import com.ylxm.mvc.entity.Doctor;
import com.ylxm.mvc.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lhlog351X
 * com.ylxm.mvc.service.impl
 * 2023/10/25 14:33
 */
@Component

public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private  DoctorDao doctorDao;
    @Override
    public List<Doctor> dutyDoctors() {
        return doctorDao.dutyDoctors();
    }
}
