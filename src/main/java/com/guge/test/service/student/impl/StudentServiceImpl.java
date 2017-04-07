package com.guge.test.service.student.impl;

import com.guge.test.busness.StudentBusiness;
import com.guge.test.model.Students;
import com.guge.test.service.student.StudentService;

import java.util.List;


/**
 * 
 */
public class StudentServiceImpl implements StudentService {

	@Override
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		return StudentBusiness.getAllStudents();
	}

}
