package com.ylxm.mvc.dao;

import com.ylxm.mvc.entity.Subject;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lhlog351X
 * com.ylxm.mvc.dao
 * 2023/10/31 14:55
 */
@Repository
public interface SubjectDao {
    List<Subject> subjectList();
}
