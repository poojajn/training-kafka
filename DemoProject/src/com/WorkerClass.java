package com;

public class WorkerClass {

	public static void main(String[] args) {
		
    Runner runner=new Runner();
    
    
    System.out.println("::::::::::::::::::::::::::::::::");
   runner.execute1((str1,str2)->
   {System.out.println("hi we r doing some work in main");
	int str1lng=str1.length();
	int str2lng=str2.length();
	int result=0;
	if(str1lng>str2lng) {
		return result=str1lng;
		
	}
	else
		return result=str2lng;
	         });
    
    
    System.out.println("::::::::::::::::::::::::::::::::");
    runner.execute1(new WorkerInterface1() {
    	@Override
    	public int doSomeWork1(String str1,String str2) {
    		System.out.println("hi we r doing some work in main");
    		int str1lng=str1.length();
    		int str2lng=str2.length();
    		int result=0;
    		if(str1lng>str2lng) {
    			return result=str1lng;
    			
    		}
    		else
    			return result=str2lng;
    		 
   	     }
    });
    
    
	}

}
