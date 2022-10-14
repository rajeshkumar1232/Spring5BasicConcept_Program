package com.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.dto.Student;
import com.mysql.cj.jdbc.MysqlDataSource;
//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

//@Component(studentDao)
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private MysqlDataSource datasource;
	
	@Override
	public String add(Student stu) {
		String status = "";
		try {
			java.sql.Connection con = datasource.getConnection();
			java.sql.PreparedStatement ps = con.prepareStatement("select * from Student where SID = ?");
			ps.setString(1, stu.getSid());
			ResultSet rs = ps.executeQuery();
			boolean b = rs.next();
			if(b==true) {
				status = "existed";
			}else {
				ps = con.prepareStatement("insert into Student values(?,?,?)");
				ps.setString(1, stu.getSid());
				ps.setString(2, stu.getsName());
				ps.setString(3, stu.getsAddr());
				int rowCount = ps.executeUpdate();
				if(rowCount == 1) {
					status = "success";
				}else {
					status = "failure";
				}
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public Student search(String sid) {
		Student student = null;
		try {
			Connection con = datasource.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Student where sid = ?");
			ps.setString(1, sid);
			ResultSet rs = ps.executeQuery();
			boolean b = rs.next();

			if(b == true) {
				student = new Student();
				student.setSid(rs.getString("sid"));
				student.setsName(rs.getString("sname"));
				student.setsAddr(rs.getString("addr"));
			}else {
				student = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public String update(Student student) {
		String status = "";
		try {
			Connection con = datasource.getConnection();
			PreparedStatement ps = con.prepareStatement(" update Student set sname = ? , addr = ? where sid = ? ");
			ps.setString(1, student.getsName());
			ps.setString(2, student.getsAddr());
			ps.setString(3, student.getSid());
			
			int rowcount =ps.executeUpdate();
			
			if(rowcount == 1) {
				status = "success";
			}else {
				status = "failure";
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public String delete(String sid) {
		String status = "";
		try {
			Connection con = datasource.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Student where sid =?");
			ps.setString(1, sid);
			ResultSet rs = ps.executeQuery();
			boolean b =rs.next();
			if(b == true){
				 ps = con.prepareStatement("delete from Student where sid = ? ");
				 ps.setString(1, sid);
				 int rowcount = ps.executeUpdate();
				 if(rowcount ==1) {
					 status = "success";					 
				 }else {
					 status = "failure";
				 }
			}else{
				status = "notExist";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
