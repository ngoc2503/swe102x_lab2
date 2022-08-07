package com.swe102x.myclass;

import java.util.ArrayList;
import java.util.List;

import com.swe102x.myinterface.Shape;
import com.swe102x.myinterface.Visitor;

public class CompoundShape implements Shape{
	private int id;
	public List<Shape> children = new ArrayList<>();
	
	public CompoundShape(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
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
		return visitor.visitorCompoundGraphic(this);
	}
	
	public void add(Shape shape) {
		children.add(shape);
	}

}
