package com.savan.bike.test;

import java.util.LinkedHashMap;
import java.util.*;


public class Testing {
	
	static class Result{
		private int index;
		private int sum;
		
		Result(int index,int sum){
			this.index=index;
			this.sum=sum;
		}
	}
	
	
	public static Result getMaxSumIndex(int k,int[] arr)
	{
		int current =0;
		int index=0;
	
		for(int i=0;i<k;i++)
			current +=arr[i];
		
		int max =current;
		for(int i=k;i<arr.length;i++) {
			current +=arr[i]-arr[i-k];
			if(current>max ) {
				max=current;
				index=i-k+1;
			}			}		
		return new Result(index,max);
	}
	public static String findLargestSubString(String str) {
		 Map<Character,Integer> map=new LinkedHashMap<>();
		 int stringlength=0;
		 String subString=null;
		 
		 char[] ch=str.toCharArray(); 
		 
		 for(int i=0;i<str.length();i++)
		 {
			 char c=ch[i];
			 if(!map.containsKey(c)) {
				 map.put(c, i);
			 }else {
				 i=map.get(c);
				 map.clear();
			 }
			 if(map.size() > stringlength) {
				 stringlength=map.size();
				 subString =map.keySet().toString();
			 }
		 }
		 return subString;
	}
	
public static void main(String[]arg) {
	// TODO Auto-generated method stub
   int arr[]= {4,5,9,1,6,0,19};
   

   
   Result resultSum= getMaxSumIndex(3,arr);
   System.out.print("index ="+resultSum.index+", "+"largest sum ="+resultSum.sum);
   System.out.print("longest substring");
   String str="abcdeaaabgfdsertewsasdf";
   String strlen= findLargestSubString(str);
  
   System.out.print("longest substring"+strlen);
   
   
}
}
