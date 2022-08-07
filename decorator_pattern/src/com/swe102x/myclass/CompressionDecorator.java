package com.swe102x.myclass;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

import com.swe102x.myinterface.DataSource;


public class CompressionDecorator extends DataSourceDecorator{
	private int comLevel = 6;

	public CompressionDecorator(DataSource wrappee) {
		super(wrappee);
	}

	public int getComLevel() {
		return comLevel;
	}
	
	public void setComLevel(int comLevel) {
		this.comLevel = comLevel;
	}
	
    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }


	@Override
    public String readData() {
        return decompress(super.readData());
    }
	
    private String compress(String data) {
    	byte[] result = data.getBytes();
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(comLevel));
            dos.write(result);
            dos.close();
            bout.close();
            return Base64.getEncoder().encodeToString(bout.toByteArray());
        } catch (IOException ex) {
            return null;
        }
	}


	private String decompress(String readData) {
		byte[] data = Base64.getDecoder().decode(readData);
        try {
            InputStream in = new ByteArrayInputStream(data);
            InflaterInputStream iin = new InflaterInputStream(in);
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            int b;
            while ((b = iin.read()) != -1) {
                bout.write(b);
            }
            in.close();
            iin.close();
            bout.close();
            return new String(bout.toByteArray());
        } catch (IOException ex) {
            return null;
        }
	}
}
