package com;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class RandomFilterEx {

	public static void main(String[] args) {
		int randomNumber =ThreadLocalRandom.current().nextInt(100,200);
		System.out.println(randomNumber);
		System.out.println("::::::::before sorted:::::::");
		Random random=new Random();
		random.ints(10, 100, 200).forEach(System.out::println);
		System.out.println("::::::::after sorted:::::::");
		random.ints(10, 100, 200).sorted().forEach(System.out::println);
		System.out.println("Max:::"+random.ints(10, 100, 200).sorted().max().getAsInt());
		System.out.println("::::::::using stream random:::::::");
		
		Stream.iterate(10,i->i+1).limit(20).sorted().forEach(System.out::println);
		 
		// @formatter:on

	}

}
