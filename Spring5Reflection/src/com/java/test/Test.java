package com.java.test;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

import com.java.entity.Employee;

public class Test {

	public static void main(String[] args) throws Exception {
		BeanInfo beanInfo = Introspector.getBeanInfo(Employee.class);
		PropertyDescriptor[] pd = beanInfo.getPropertyDescriptors();
		for(PropertyDescriptor p : pd) {
			System.out.println(p);
			System.out.println("*******************************");
			System.out.println(p.getPropertyType());
			System.out.println("*******************************");
			System.out.println(p.getReadMethod());
			System.out.println("*******************************");
			System.out.println(p.getWriteMethod());
		}
		
		MethodDescriptor[] md = beanInfo.getMethodDescriptors();
		for(MethodDescriptor m : md) {
			System.out.println(m);
	}
	}
}
