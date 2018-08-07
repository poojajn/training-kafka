package com.training.casestudy;

import com.training.casestudy.CompositeProtocal.Component.Leaf;
import com.training.casestudy.GraphicalObjectVisitor.Visitable;

public class GraphicalObjectShift  implements GraphicalObjectVisitor{
	
	
	@Override
	public void move(String str) {
		
		System.out.println(str+" shift.....");
	}

	
	
}
