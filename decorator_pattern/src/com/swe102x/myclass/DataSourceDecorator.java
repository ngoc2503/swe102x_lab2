package com.swe102x.myclass;

import com.swe102x.myinterface.DataSource;

public class DataSourceDecorator implements DataSource{
	private DataSource wrappee;
	
	public DataSourceDecorator(DataSource wrappee) {
		this.wrappee = wrappee;
	}

	@Override
	public void writeData(String data) {
		wrappee.writeData(data);
		
	}

	@Override
	public String readData() {
		// TODO Auto-generated method stub
		return wrappee.readData();
	}

}
