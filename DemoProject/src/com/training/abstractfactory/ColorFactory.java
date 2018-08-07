package com.training.abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	public  IVehicle getVehicle(String vehicle) {
		return null;
	}
	@Override
	public  IColor getColor(String color) {
		
		if(color.equals("red"))
		{
			return new Red();
		}else if(color.equals("blue"))
		{
		return new Blue();
	   }
		return null;
}
	
	
}
