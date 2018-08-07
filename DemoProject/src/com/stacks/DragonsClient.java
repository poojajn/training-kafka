package com.stacks;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DragonsClient {

	public static void main(String[] args) {
		List<Dragons> dragons=
				Stream.of(new Dragons("Errol","USA",15),
						new Dragons("Errol","USA",33),
						new Dragons("Firnam","USA",5),
						new Dragons("Hasai","France",12),
						new Dragons("IceFire","France",3))
                     .collect(Collectors.toList());
		//to find no.of dragons
		Map<String,Long> dragonMapCount=dragons.stream()
				.collect(Collectors.groupingBy(Dragons::getName,Collectors.counting()));
		
		System.out.println(dragonMapCount);
		System.out.println("::::::::summary::max,min,avg::::");
	     IntSummaryStatistics sumStatisticsOfDragons=dragons.stream().mapToInt((x)->x.getCount()).summaryStatistics();
				
		
		
		//**************************************************
		System.out.println("::::::::summary::::::");
		Map<String,Integer> sumOfDragons=dragons.stream()
				.collect(Collectors.groupingBy(Dragons::getName,Collectors.summingInt(Dragons::getCount)));
		
		System.out.println("::::::::Reports for sum of Dragons::::::");
		sumOfDragons.forEach(
		(k,v)->{System.out.println("Dragon Name::"+k+" ===Number of Dragons:::"+v);});
		
		System.out.println("::::::::Max::::::");
		
		
		  Optional<Dragons> maxCount = 
				  dragons.stream()
		            .collect(Collectors.maxBy(Comparator.comparing(Dragons::getCount)));
		  System.out.println(maxCount);
		  System.out.println("::::::::Min::::::");
			
			
		  Optional<Dragons> minCount = 
				  dragons.stream()
		            .collect(Collectors.minBy(Comparator.comparing(Dragons::getCount)));
		  System.out.println(minCount);
		  Double avgCount = dragons
			        .stream()
			        .collect(Collectors.averagingInt(Dragons::getCount));
		  System.out.println(avgCount);
		  
		  System.out.println("::::::::Dragons by county::::::");
			Map<String,Set<String>> dragCountry=dragons.stream()
					.collect(Collectors.groupingBy(Dragons::getCountry,Collectors.mapping(Dragons::getName,Collectors.toSet())));
			
			System.out.println("::::::::Reports for  Dragons by country::::::");
			dragCountry.forEach(
			(k,v)->{System.out.println("country Name::"+k+" ===types Dragons:::"+v);});
		//find stats
		//should display sum/avg/min/max of dragons
		
		//find dragons by country&keep the name of dragon
		//of diff countries in the list/set
	}

}
