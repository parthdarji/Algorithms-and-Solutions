package com.hackerRank;

import java.util.Scanner;
/*
 input =7
1234
91011
99100
101103
010203
13
1
 * */
public class separateNumber {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            long x = -1;
         boolean contains = false;
         for(int i=1;i<=s.length()/2;++i){
        	 long halfString  = Long.parseLong(s.substring(0, i));
        	
        	 x = halfString;
        	 String createTest = Long.toString(x);
        	 while(createTest.length()<s.length()){
        		 createTest+=Long.toString(++halfString);
        		
        	 }
        	 //System.out.println(createTest +" : "+s);
        	 if(createTest.equals(s)){
        		 contains = true;
        		 break;
        	 }
         
         }
         System.out.println(contains?"Yes "+x:"No");
        }
    }
}
