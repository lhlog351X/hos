package com.ylxm.mvc.service;

import com.ylxm.mvc.entity.Doctor;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author lhlog351X
 * com.ylxm.mvc.service
 * 2023/10/24 21:29
 */

@Service
public interface DoctorService {

    List<Doctor> dutyDoctors();
}
