package com.training.abstractfactory;

public interface IColor {
 void paintCar();
 
}
class Red implements IColor{
	@Override
	public void paintCar() {
		System.out.println("car painting colr Red");
	}
	
}
class Blue implements IColor{
	@Override
	public void paintCar() {
		System.out.println("Truck painting color Blue ");
	}
	
}