package com.ylxm.mvc.service;

import com.ylxm.mvc.entity.Attend;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lhlog351X
 * com.ylxm.mvc.service
 * 2023/10/31 14:10
 */
@Service
public interface AttendService {

    List<Attend> attendList(long subId);
}
