package com.training.abstractfactory;

public class Client {

	public static void main(String[] args) {
		AbstractFactory vehicleFactory=FactoryProducer.getFactory("vehicle");
		IVehicle fordCar=vehicleFactory.getVehicle("car");
		IColor redColor=FactoryProducer.getFactory("color").getColor("red");
		
		
		fordCar.move();
		fordCar.speed(120);
		fordCar.paint(redColor);
		IVehicle manTruck=vehicleFactory.getVehicle("truck");
		IColor blueColor=FactoryProducer.getFactory("color").getColor("blue");
		manTruck.move();
		manTruck.speed(65);
		manTruck.paint(blueColor);
		
		
		
	
		
		
		
		
	}
}
