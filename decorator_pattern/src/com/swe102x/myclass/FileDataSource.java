package com.swe102x.myclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

import com.swe102x.myinterface.DataSource;

public class FileDataSource implements DataSource{
	private String name;
	
	public FileDataSource(String name) {
		this.name = name;
	}
	
	

	@Override
	public void writeData(String data) {
		File file = new File(name);
		try(OutputStream fos = new FileOutputStream(file)) {
			fos.write(data.getBytes(), 0, data.length());
		}
		// TODO Auto-generated method stub
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String readData() {
		char [] buffer = null;
		File file = new File(name);
		try(FileReader reader = new FileReader(file)) {
			buffer = new char[(int)file.length()];
			reader.read(buffer);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return new String(buffer);
	}

}
