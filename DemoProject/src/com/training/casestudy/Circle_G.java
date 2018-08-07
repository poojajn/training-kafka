package com.training.casestudy;

import com.training.casestudy.GraphicalObjectVisitor.Visitable;

public class Circle_G implements Circle ,Visitable{

	 String type="Circle_G";
	public void CircleType() {
		System.out.println("Circle type is Circle_G...");
	}
	
		@Override
		public void shape() {
			
			
			System.out.println(type+" shape ........");
			
		}


	@Override
	public void draw() {
		System.out.println("drawed Circle_G shape ........");
		
	}
	public String ObectType() {
		return this.type;
	}

	@Override
	public void Accept(GraphicalObjectVisitor visitor) {
		
		visitor.move(this.type);
		
	}
}
