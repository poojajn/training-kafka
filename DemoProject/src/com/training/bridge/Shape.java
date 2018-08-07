package com.training.bridge;



public abstract class Shape {
	private IColor color;
	
    public Shape(IColor color) {
    	  this.color=color;
    }
    public abstract void applyColor();
	protected IColor getColor() {
		return color;
	}
}
