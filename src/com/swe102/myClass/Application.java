package com.swe102.myClass;

import com.swe102.myinterface.Button;
import com.swe102.myinterface.CheckBox;
import com.swe102.myinterface.GUIFactory;

public class Application {
	private Button button;
	private CheckBox checkbox;
	
	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckBox();
	}
	
	public void paint() {
		button.paint();
		checkbox.paint();
	}

}
