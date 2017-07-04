package com.hackerRank;

import java.util.HashSet;
import java.util.Scanner;
/*
 input -abccddde
6
1
3
12
5
9
10

Also for large input, remove public method and out inside the main method.
 */
public class WeightedUniformString {
	 private static Scanner in;

	public static void main(String[] args) {
	        in = new Scanner(System.in);
	        String s = "abccddde";
	        char[] arr = s.toCharArray();
	        int n = 6;
	        for(int a0 = 0; a0 < n; a0++){
	            int x = in.nextInt();
	           System.out.println(WeightedString(s,x) );
	        }     
	    }
  
	 public static String WeightedString(String s, int x){
		 int count =1;
		 int lastchar = 0;
		 char[] c = s.toCharArray();
		 HashSet<Integer> List = new HashSet<Integer>();
		 for(int i=0;i<c.length;i++){
			 int value = c[i]-96;
			 if(value == lastchar){
				 count++;
			 }else{
				 count=1;
				 lastchar = value;
			 }
			 List.add(value*count);
		 }
		 if(List.contains(x)){
			 return "Yes";	  
		 }else{
			 return "No";
		 }
	
	 }
	 
}
