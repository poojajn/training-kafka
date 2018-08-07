package com.training.casestudy;

import com.training.casestudy.CompositeProtocal.Component.Composite;
import com.training.casestudy.CompositeProtocal.Component.Leaf;
import com.training.casestudy.GraphicalObjectVisitor.Visitable;

public class ObjectGroup implements Composite,Visitable{

	@Override
	public void addObject(Leaf leaf) {
		
		System.out.println(leaf.ObectType()+" is added......");
		
	}

	@Override
	public void removeObject(Leaf leaf) {
		System.out.println(leaf.ObectType()+" is remove......");
		
	}

	@Override
	public void Accept(GraphicalObjectVisitor visitor) {
		
		
	}

	
	
	
}
