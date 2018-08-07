package com.training.casestudy;

import com.training.casestudy.CompositeProtocal.Component.Leaf;
import com.training.casestudy.GraphicalObjectVisitor.Visitable;

public class Circle_A implements Circle,Visitable{

	String type="Circle_A";
	
	public void CircleType() {
		System.out.println("Circle type is Circle_A...");
	}

	@Override
	public void shape() {
		
		
		System.out.println(type+" shape ........");
		
	}

	@Override
	public void draw() {
		System.out.println("drawed Circle_A shape ........");
		
	}
	
	public String ObectType() {
		return this.type;
	}

	@Override
	public void Accept(GraphicalObjectVisitor visitor) {
		
		visitor.move(this.type);
	}
	
}
