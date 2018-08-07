package com.training.abstractfactory;

public abstract class AbstractFactory {
 
	public abstract IVehicle getVehicle(String vehicle);
	public abstract IColor getColor(String color);
}
