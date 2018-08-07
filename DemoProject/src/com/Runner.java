package com;

public class Runner {

	public void execute(WorkerInterface workerInterface) {
		System.out.println("In execute mothod");
		workerInterface.doSomeWork();
	}
	public void execute1(WorkerInterface1 workerInterface1) {
		System.out.println("In execute1 mothod");
		int result= workerInterface1.doSomeWork1("Rama","Tejaswini");
		System.out.println("result:::"+result);
		
	}
	
}
