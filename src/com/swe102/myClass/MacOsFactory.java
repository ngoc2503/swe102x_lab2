package com.swe102.myClass;

import com.swe102.myinterface.Button;
import com.swe102.myinterface.CheckBox;
import com.swe102.myinterface.GUIFactory;

public class MacOsFactory implements GUIFactory{
	
	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacOSButton();
	}

	@Override
	public CheckBox createCheckBox() {
		// TODO Auto-generated method stub
		return new MacOsCheckBox();
	}
}
