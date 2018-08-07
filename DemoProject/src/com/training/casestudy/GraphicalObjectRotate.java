package com.training.casestudy;

import com.training.casestudy.CompositeProtocal.Component.Leaf;

public class GraphicalObjectRotate implements GraphicalObjectVisitor{

	
	@Override
	public void move(String str) {
		
		System.out.println(str+" shift.....");
	}

	
	
}