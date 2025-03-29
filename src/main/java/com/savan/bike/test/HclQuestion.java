package com.savan.bike.test;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;
public class HclQuestion {
	
	
	public static void main(String[] args) {
		
		String str= "hello i am good";
		
		Map<Character,Long> countChar =str.chars().mapToObj(c->(char)c).filter(c->c!=' ').collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting()));
				
		System.out.print(countChar);
		
		 List<String> strings = Arrays.asList("apple", "banana", "orange", "watermelon", "grapefruit");
	        // Your task is to create a stream pipeline to filter out strings with length > 5
	        // and convert the remaining strings to uppercase.

	        List<String> filteredAndUppercaseStrings = strings.stream()
	                // TODO: Add necessary stream operations here (filter and map)
	                //       to filter out strings with length > 5 and convert the remaining strings to uppercase.
	                        .filter(i->i.length()>5)
	                .map(String :: toUpperCase)
	                .collect(Collectors.toList());

	        System.out.println(filteredAndUppercaseStrings);
	        
	        
	        List<String> list= Arrays.asList("rajf","rajesh");
//find each string length
	        Map<String, Integer> countLength = list.stream().collect(Collectors.toMap(st->st,String::length));
	        System.out.println(countLength);
	        //largest string
	        String maxStr= list.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
	        		System.out.println(maxStr);
//find max integer.
	        List<Integer> numbers =Arrays.asList(1,2,3,4,5,8,12,99);
	        int max =numbers.stream().max((a,b)->a.compareTo(b)).get();
	        System.out.println(max);
	        
	        
	        List<String> names = Arrays.asList("Apple", "Banana", "Avocado", "Blueberry");

	        Map<Character, List<String>> grouped = names.stream()
	            .collect(Collectors.groupingBy(name -> name.charAt(0)));

	        System.out.println(grouped); 
	        // Output: {A=[Apple, Avocado], B=[Banana, Blueberry]}

	        
	        
	        
	        
	        
	        
		
	}

}
