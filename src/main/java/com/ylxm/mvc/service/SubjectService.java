package com.ylxm.mvc.service;

import com.ylxm.mvc.entity.Subject;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lhlog351X
 * com.ylxm.mvc.service
 * 2023/10/31 14:56
 */
@Service
public interface SubjectService {

    List<Subject> subjectList();
}
