package com.training.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonClient03 {

	public static void main(String[] args)throws InvocationTargetException,IllegalAccessException,InstantiationException {
		Singleton singleton1=Singleton.getInstance();
		Singleton singleton2=null;
		Singleton singleton3=null;
		Constructor [] constructors=Singleton.class.getDeclaredConstructors();
		for(Constructor constructor:constructors) {
			constructor.setAccessible(true);
			
			 singleton2=(Singleton)constructor.newInstance();
			 singleton3=(Singleton)constructor.newInstance();
			 break;
			 
		}
	}

}
