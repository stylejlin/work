package com.jlin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlin.bean.Student;
import com.jlin.dao.StudentDao;
//创建Service对象
@Service
public class StudentServiceImpl implements StudentService{
	
	//注入dao对象
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> findStudents() {
		return studentDao.selectStudents();
	}

}
