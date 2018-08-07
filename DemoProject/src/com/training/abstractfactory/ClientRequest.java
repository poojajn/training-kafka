package com.training.abstractfactory;

public class ClientRequest {
	private IVehicle vehicle;
	private IColor color;
	
	public IVehicle getVehicle() {
		return vehicle;
	}
	public ClientRequest(IVehicle vehicle, IColor color) {
		super();
		this.vehicle = vehicle;
		this.color = color;
	}
	public void setVehicle(IVehicle vehicle) {
		this.vehicle = vehicle;
	}
	public IColor getColor() {
		return color;
	}
	public void setColor(IColor color) {
		this.color = color;
	}
	
 
}