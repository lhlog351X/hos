package com.ylxm.mvc.controller;

import com.ylxm.mvc.common.R;
import com.ylxm.mvc.entity.Doctor;
import com.ylxm.mvc.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author lhlog351X
 * com.ylxm.mvc.controller
 * 2023/10/24 21:29
 */

@RestController
@RequestMapping("/index")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/dutyDoctors")
    public R<List<Doctor>> getDutyDoctors(){
        return R.success(doctorService.dutyDoctors());
    }
}
