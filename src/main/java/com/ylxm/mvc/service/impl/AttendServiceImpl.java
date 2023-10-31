package com.ylxm.mvc.service.impl;

import com.ylxm.mvc.dao.AttendDao;
import com.ylxm.mvc.entity.Attend;
import com.ylxm.mvc.service.AttendService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lhlog351X
 * com.ylxm.mvc.service.impl
 * 2023/10/31 14:10
 */
@Component
@AllArgsConstructor
public class AttendServiceImpl implements AttendService {

    private final AttendDao attendDao;

    @Override
    public List<Attend> attendList(long subId) {
        return attendDao.attendList(subId);
    }
}
