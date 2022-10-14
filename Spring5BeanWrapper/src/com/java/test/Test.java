package com.java.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.java.beans.Employee;

public class Test {

	public static void main(String[] args) {
		
		BeanWrapper bw = new BeanWrapperImpl(Employee.class);
		bw.setPropertyValue("eno","111");
		bw.setPropertyValue("name", "BBB");
		bw.setPropertyValue("sal", "50000");
		bw.setPropertyValue("addr", "APAC");
		System.out.println(" ");
		System.out.println("Employee details");
		System.out.println(" ");
		System.out.println("Employee number : "+bw.getPropertyValue("eno"));
		System.out.println("Employee no : "+bw.getPropertyValue("name"));
		System.out.println("Employee salary : "+bw.getPropertyValue("sal"));
		System.out.println("Employee address : "+bw.getPropertyValue("addr"));
		
		
		Map<String ,Object> map = new HashMap<String, Object>();
		map.put("eno", "222");
		map.put("name", "BBB");
		map.put("sal", "30000");
		map.put("addr", "APAC");
		bw.setPropertyValues(map);
		
		Employee emp = (Employee) bw.getWrappedInstance();
		emp.getEmployeeDetails();
		System.out.println(" ");
		System.out.println(bw.isReadableProperty("eno"));
		System.out.println(bw.isReadableProperty("name"));
		System.out.println(bw.isReadableProperty("sal"));
		System.out.println(bw.isReadableProperty("addr"));
		System.out.println(" ");
		System.out.println(bw.isWritableProperty("eno"));
		System.out.println(bw.isWritableProperty("name"));
		System.out.println(bw.isWritableProperty("sal"));
		System.out.println(bw.isWritableProperty("addr"));
		System.out.println("");
		Employee emp1 = new Employee();
		BeanUtils.copyProperties(emp, emp1);
		emp1.getEmployeeDetails();
		
	}

}
