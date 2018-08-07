package com.training.factory;

public  abstract class Car {
    public static Car getCar(CarName carName) {
    	if(carName==CarName.MARUTI) {
    		return new Maruti();
    	}else if(carName==CarName.BW) {
    		return new BW();
    	}else if(carName==CarName.AUDI) {
    		return new Audi();
    }
    	 return null;
    }
    
    public abstract void drive(); 
    	
    
}
