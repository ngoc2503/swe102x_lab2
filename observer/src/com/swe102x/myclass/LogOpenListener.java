package com.swe102x.myclass;

import java.io.File;

import com.swe102x.myinterface.EventListener;

public class LogOpenListener implements EventListener{
	private File log;
	
	public LogOpenListener(String filename) {
		log = new File(filename);
	}

	@Override
	public void update(String eventType, File file) {
		 System.out.println("Save to log " + log + ": Someone has performed " + eventType +
				 " operation with the following file: " + file.getName());
		
	}

}
