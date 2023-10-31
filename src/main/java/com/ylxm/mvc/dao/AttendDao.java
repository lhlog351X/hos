package com.ylxm.mvc.dao;

import com.ylxm.mvc.entity.Attend;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lhlog351X
 * com.ylxm.mvc.dao
 * 2023/10/31 14:00
 */
@Repository
public interface AttendDao {

    List<Attend> attendList(long subId);

}
