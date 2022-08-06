package com.swe102.myClass;

import com.swe102.myinterface.GUIFactory;

public class main {
	private static Application configureApplication() {
		Application app;
		GUIFactory factory;
		
		String osName = System.getProperty("os.name").toLowerCase();
		if(osName.contains("mac")) {
			factory = new MacOsFactory();
			app = new Application(factory);
		} else {
			factory = new WindowsFactory();
			app = new Application(factory);
		}
		
		return app;
	}
	
	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();
	}
}
// result
* You have created WindowsButton.
* You have created WindowsCheckBox.
//
