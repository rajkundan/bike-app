package com.savan.bike.test;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class Infosis {
	
	public static void main(String[]arr) {
	
		List<String> list= Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
		
		
		 list.stream().filter(num->Character.isDigit(num.charAt(0))).toList().forEach(System.out::print);;
		
		
	}

}
