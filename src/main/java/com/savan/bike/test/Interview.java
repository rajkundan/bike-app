package com.savan.bike.test;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interview {

	
	public static void main(String[] args) {
		//1
		//1 1
		//2 1
		//1 2 1 1
		//1 1 1 2 2 1
		//3 1 2 2 1 1
//List<String> list=Arrays.asList("Alok","Raj","Anuj","Vaibhav","Rajni");
//        
//     //   a={Alok,Anuj}
//       //  r={Raj,ra}
//	Map<Character,List<String>> groupByChar= list.stream().collect(Collectors.groupingBy(str->str.charAt(0)));
//	System.out.print(groupByChar);
	
		 String str = "java is good language";
		 
		 String ndLargest=Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
		 String minstr=Arrays.stream(str.split(" ")).min((a,b)->a.compareTo(b)).get();
	 String minstrlength=Arrays.stream(str.split(" ")).max((a,b)->Integer.compare(a.length(), b.length())).get();
	 System.out.println ("with java 8 minlength---->"+minstrlength);
		 System.out.println ("with java 8 minstr---->"+minstr);
		 System.out.println ("with java 8 ndLargest---->"+ndLargest);
		 String wtj8= Arrays.stream(str.split(" ")).map(word->word.length()>0 ? Character.toUpperCase(word.charAt(0))+word.substring(1): word).collect(Collectors.joining(" "));
		 System.out.println ("with java 8---->"+wtj8);   
		 StringBuilder sb = new StringBuilder(); // Initialize properly
		    String[] strArray = str.split(" ");
		    for (String str1 : strArray) {
		        int x = str1.length();
		        if (x == 4) {
		            sb.append(new StringBuilder(str1).reverse()); // Use append() instead of +=
		        } else {
		            sb.append(str1); // Use append() instead of +=
		            // no need for continue here
		        }
		        sb.append(" ");
		    }
		    
		    // Print the result
		    System.out.println(sb.toString());
			String withj8str= Arrays.stream(str.split(" ")).map(word->word.length()==4 ? new StringBuilder(word).reverse().toString(): word).collect(Collectors.joining(" "));
			System.out.println("revrse word==4"+withj8str);
			
			String str2= "commehh   eeeeere";
			
			Character ch = str2.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors
					.counting())).entrySet().stream().filter(entry->entry.getValue()>=2).map(Map.Entry::getKey).findFirst().orElse(null);
			System.out.print("1st repeation char"+ ch);
			//count each char using legacy method
			
			char[] chararray= str2.toCharArray();
			Map<Character,Integer> charcount= new HashMap<>();
			
			for(char c:chararray) {
				if(c==' ')
					continue;
				if(!charcount.containsKey(c))
				{
					charcount.put(c, 1);
				}
				else
				{
					int i= charcount.get(c);
					charcount.put(c, i+1);
				}
			}
			
			System.out.print("char count"+ charcount);

			
	//----------------------------------------------------------------------------------------
			String strrrr ="aabcasfadfghk";
         String SubString= findSubString(strrrr);
         
         System.out.print(SubString        );
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
public static String findSubString(String str) {
	
	int start=0,left=0,maxlength=0;
	Set<Character> set= new HashSet<>();
	for(int right=0;right<str.length();right++) {
		while(set.contains(str.charAt(right))) {
			set.remove(str.charAt(left));
			left++;
		}
		set.add(str.charAt(right));
		
		if(right-left+1>maxlength) {
			maxlength=right-left+1;
			start=left;
		}
		
	}
	return str.substring(start,start+maxlength);
}
	
}
