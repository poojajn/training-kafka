package com;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LamdaThreadService {

	public static void main(String[] args)throws InterruptedException,ExecutionException{
		
		//jdk1.7
		 ExecutorService executeService=Executors.newSingleThreadExecutor();
		 
		 executeService.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hi, i'm in Annonimous Block");
				
			}
		});
		 //jdk1.8
		 executeService.shutdown();
		 ExecutorService executeService1=Executors.newSingleThreadExecutor();
		 executeService1.execute(()->{
			 System.out.println("hi, i'm in Lamda Block");
		 });
		 executeService1.shutdown();
		 System.out.println(":::::callabe work::::::");
		 ExecutorService executeService2=Executors.newSingleThreadExecutor();
		  Set<Callable<String>> callables=initializeCallables();
		  
		List<Future<String>> result=executeService2.invokeAll(callables);
		
		for(Future temp:result) {
			 System.out.println(temp.get());//waits for task to get completed
		   }
		executeService2.shutdown();
	    }
		 public static Set<Callable<String>> initializeCallables()
		 {
			 Set<Callable<String>> callables=new HashSet<Callable<String>>();
			 callables.add(()->"1st callable");
			 callables.add(()->"2nd callable");
			 callables.add(()->"3rd callable");
			 callables.add(()->"4th callable");
			 callables.add(()->"5th callable");
			 
			 callables.add(new Callable<String>() {
				 
				@Override
				public String call() throws Exception{
					return "Callable thread in Ananymous class";
				}
				 
			 });
			 callables.add(()->{return "complex business logic";});
			 return callables;
		 }
 }


