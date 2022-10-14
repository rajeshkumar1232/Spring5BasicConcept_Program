package com.java.dao;

import com.java.dto.Student;

public interface StudentDao {
	
	public String add(Student stu);
	public Student search(String sid);
	public String update(Student student);
	public String delete(String sid);

}
