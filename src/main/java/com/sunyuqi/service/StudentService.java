package com.sunyuqi.service;

import com.sunyuqi.dao.StudentDao;
import com.sunyuqi.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    @Transactional
    public void updateStudent(Student student)
    {
        studentDao.updateByPrimaryKeySelective(student);
    }
}
