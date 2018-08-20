package com;

import java.util.ArrayList;
import java.util.List;

public class DemoRev {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("A");
		list.add("C");
		list.add("B");
         list.stream().forEach(System.out::println);
         list.stream().map(p->p.toLowerCase()).forEach(System.out::println);
         
         
	}

}
