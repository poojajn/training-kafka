package com.training.casestudy;

import com.training.casestudy.CompositeProtocal.Component.Leaf;

public interface GraphicalObjectVisitor {

	
	
	public void move(String str);
	
	public interface Visitable{
		
		public void Accept(GraphicalObjectVisitor visitor);
		
	}
	
	
}
