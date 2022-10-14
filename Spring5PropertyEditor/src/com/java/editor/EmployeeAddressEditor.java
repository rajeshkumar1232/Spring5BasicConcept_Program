package com.java.editor;

import java.beans.PropertyEditorSupport;

import com.java.beans.Address;

public class EmployeeAddressEditor extends PropertyEditorSupport{
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
			String[] str = text.split("-");
			Address add = new Address();
			add.setDistic(str[0]);
			add.setState(str[1]);
		super.setValue(add);
	}

}
