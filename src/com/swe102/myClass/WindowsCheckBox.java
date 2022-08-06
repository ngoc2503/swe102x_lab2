package com.swe102.myClass;

import com.swe102.myinterface.CheckBox;

public class WindowsCheckBox implements CheckBox{
	@Override
	public void paint() {
		System.out.println("You have created WindowsCheckBox.");
	}

}
