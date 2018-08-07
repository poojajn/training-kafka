package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
    Predicate<Integer> greaterThan=i->i>10;
    Predicate<Integer> lessThan=i->i<10;
    Predicate<Integer> positiveNumbers=i->i>0;
    Predicate<Integer> betweenRange=i->i>0&&i<100;
    
    System.out.println(greaterThan.test(5));
    
    List<Integer> integerList=Arrays.asList(12,23,34,45,-33,-10,2,77);
    
    List<Integer> greaterThan10List=filteredList(integerList,greaterThan);
    
    greaterThan10List.forEach(System.out::println);
    
    Predicate<Integer> compoundPredicate=positiveNumbers.and(betweenRange);
    List<Integer> compoundList=filteredList(integerList,compoundPredicate);
    
    System.out.println("::::: list of values in predicate::::::");
    compoundList.forEach(System.out::println);
	}
	
  public static List<Integer> filteredList(List<Integer> numbers,Predicate<Integer> predicate){
  List<Integer> filterList=new ArrayList<Integer>();
  for(Integer temp:numbers) {
	  if(predicate.test(temp)) {
		  filterList.add(temp);
	  }
  }
  return  filterList;
  }
}
