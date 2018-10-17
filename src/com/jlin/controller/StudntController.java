package com.jlin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jlin.bean.Student;
import com.jlin.service.StudentService;

@Controller
@RequestMapping("stu")
public class StudntController {
	//注入service对象
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("students.do")
	@ResponseBody
	public Object studentList(){
		//调用service对象方法
		List<Student> list=studentService.findStudents();
		return list;
		
	}
}
