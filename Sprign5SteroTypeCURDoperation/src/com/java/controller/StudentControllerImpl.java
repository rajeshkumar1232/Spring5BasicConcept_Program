package com.java.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.java.dto.Student;
import com.java.services.StudentService;

@Controller("studentController")
public class StudentControllerImpl implements StudentController {
	
	BufferedReader br = null;
	@Autowired
	private StudentService studentService;
	
	
	public StudentControllerImpl() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addStudent() {
		try {
			System.out.print("Student ID : ");
			String sid =br.readLine();
			System.out.print("Student Name : ");
			String sname = br.readLine();
			System.out.print("Student Address : ");
			String saddr =br.readLine();
			
			Student student = new Student();
			student.setSid(sid);
			student.setsName(sname);
			student.setsAddr(saddr);
			
			String status = studentService.addStudent(student);
			
			if(status.equals("existed")) {
				System.out.println("Student Existed");
			}if(status.equals("success")) {
				System.out.println("Student Inserted Success");
			}if(status.equals("failure")) {
				System.out.println("Student insertion Failed");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void searchStudent() {
		try {
			System.out.print("Enter Student id  : ");
			String sid = br.readLine();
			Student student = studentService.searchStudent(sid);
			
			if(student == null) {
				System.out.println("Student not existed");
			}else {
				System.out.println("Student detials");
				System.out.println("Student id         :"+student.getSid());
				System.out.println("Student Name       :"+student.getsName());
				System.out.println("Student Address    :"+student.getsAddr());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudent() {
		try {
			System.out.print("Student id   :");
			String sid = br.readLine();
			Student student = studentService.searchStudent(sid);
			if(student == null) {
				System.out.println("Student not exist");
			}else {
				System.out.print("studentName Old value : "+student.getsName()+" new value : ");
				String sname = br.readLine();
				System.out.print("student Addr Old value : "+student.getsAddr()+" new value : ");
				String saddr = br.readLine();
				student.setsName(sname);
				student.setsAddr(saddr);
				
				String status = studentService.updateStudent(student);
				if(status.equals("success")) {
					System.out.println("Student updated successfully");
				}else {
					System.out.println("student update fails");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudent() {
		try {
			System.out.println("Student id :");
			String sid = br.readLine();
			String status = studentService.deleteStudent(sid);
			if(status.equals("success")) {
				System.out.println("Student delted sucessfully");
			}if(status.equals("failure")) {
				System.out.println("student delteion failure");
			}if(status.equals("notExist"))
				System.out.println("Student details not exist");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
