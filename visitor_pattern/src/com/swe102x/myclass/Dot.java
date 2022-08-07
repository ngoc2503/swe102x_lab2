package com.swe102x.myclass;

import com.swe102x.myinterface.Shape;
import com.swe102x.myinterface.Visitor;

public class Dot implements Shape {
	private int id;
	private int x;
	private int y;
	
	// contructor
	public Dot(int id, int x, int y) {
		this.id = id;
		this.x = x;
		this.y = y;
	}
	public Dot() {
		
	}
	

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visitDot(this);
	}
	public int getId() {
		return id;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

}
