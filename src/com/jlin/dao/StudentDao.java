package com.jlin.dao;

import java.util.List;

import com.jlin.bean.Student;

public interface StudentDao {
	

	List<Student> selectStudents();
}
