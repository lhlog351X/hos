package com.ylxm.mvc.service.impl;

import com.ylxm.mvc.dao.SubjectDao;
import com.ylxm.mvc.entity.Subject;
import com.ylxm.mvc.service.SubjectService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lhlog351X
 * com.ylxm.mvc.service.impl
 * 2023/10/31 14:56
 */
@Component
@AllArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    private final SubjectDao subjectDao;

    @Override
    public List<Subject> subjectList() {
        return subjectDao.subjectList();
    }
}
