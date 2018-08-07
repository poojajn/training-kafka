package com.training.casestudy;

import com.training.casestudy.CompositeProtocal.Component.Leaf;
import com.training.casestudy.GraphicalObjectVisitor.Visitable;

public class Line implements Leaf,Visitable{
     String type="Line";
	@Override
	public void shape() {
		
		
		System.out.println(type+" shape ........");
		
	}

	@Override
	public void draw() {
		System.out.println("drawed Line shape ........");
		
	}
	public String ObectType() {
		return this.type;
	}

	@Override
	public void Accept(GraphicalObjectVisitor visitor) {
		visitor.move(this.type);
		
	}
	
}
