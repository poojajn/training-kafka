package com;

public class LamdaThread04 {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hi i'm from ananymous call...start");
				try {
					 Thread.sleep(100);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("ananymous call...exiting");
			}
		}).start();
  new Thread(()->
    {  System.out.println("Hi i'm from lamda");
         try {
		           Thread.sleep(100);
	          }catch(InterruptedException e) {
		                                      e.printStackTrace();
	                                        }
      System.out.println("lamda call...exiting");
      }).start();
  
  //example  Cunsumer
  
  
  
  
  
	}

}
