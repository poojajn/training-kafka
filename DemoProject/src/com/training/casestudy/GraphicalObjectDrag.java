package com.training.casestudy;

import com.training.casestudy.CompositeProtocal.Component.Leaf;

public class GraphicalObjectDrag  implements GraphicalObjectVisitor{

	
	@Override
	public void move(String str) {
		
		System.out.println(str+" shift.....");
	}

}
