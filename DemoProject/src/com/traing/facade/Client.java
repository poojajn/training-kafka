package com.traing.facade;

public class Client {

	public static void main(String[] args) {
		FacadeCar myCar=new FacadeCar();
		myCar.sedanDriver();
		myCar.suvDriver();
		myCar.hatchBackDriver();
	}

}
