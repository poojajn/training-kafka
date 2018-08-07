package com.training.casestudy;

import com.training.casestudy.CompositeProtocal.Component;
import com.training.casestudy.CompositeProtocal.Component.Composite;
import com.training.casestudy.CompositeProtocal.Component.Leaf;
import com.training.casestudy.GraphicalObjectVisitor.Visitable;


public class Customer {

	public static void main(String[] args) {
		
		
		Leaf circleA=new Circle_A();
		
		System.out.println("Component created......");
		Component.Leaf line1=new Line();
		line1.draw();
		line1.shape();
		
		
		
		GraphicalObjectVisitor shift=new GraphicalObjectShift();
		
		Visitable visitor=new Line();
		visitor.Accept(shift);
		
		
		
		System.out.println(" >>>>>>......>>>>>>>>");
		
		System.out.println(" new Component created......");
		
		Composite  objAction=new ObjectGroup();
		objAction.addObject(circleA);
	}

}
