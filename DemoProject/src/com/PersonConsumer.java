package com;

import java.util.function.Consumer;

public class PersonConsumer implements Consumer<Person> {
     @Override
     public void accept(Person t) {
    	 System.out.println("persn ID::"+t.getpId()+":::person Name::"+t.getName());
    	 
     }
}
