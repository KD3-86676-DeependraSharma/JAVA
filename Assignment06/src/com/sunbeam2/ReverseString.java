package com.sunbeam2;

import java.util.Scanner;

public class ReverseString {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String :");
      String s=sc.next();
      
      StringBuffer Rev=new StringBuffer(s);
      
      String RevString=Rev.reverse().toString();
      
      System.out.println(s);
      System.out.println(RevString);
      
      if(s.equals(RevString)) {
    	  System.out.println("str is palindrome");
      }
      else {
    	  System.out.println("str is not palindrome");
      }
      
	}

}
