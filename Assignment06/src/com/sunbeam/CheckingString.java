package com.sunbeam;

import java.util.Scanner;

public class CheckingString {
	String s1;
	


	public CheckingString() {
		super();
	}
	public CheckingString(String s1) {
		super();
		this.s1 = s1;
	}
	
	public void setS1(String s1) throws ExceptionLineTooLong {
		int s=s1.length();
		System.out.println("string length :"+s);
		if(s<0 ||s>80) {
			throw new ExceptionLineTooLong();
		}
		this.s1 = s1;
	}
	
	public String getS1() {
		return s1;
	}
	public void accept(Scanner sc) {
		System.out.println("Enter String :");
		s1=sc.next();
	}
	

	@Override
	public String toString() {
		return "CheckingString [s1=" + s1 + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		CheckingString c1=new CheckingString();
		
		try {
			c1.accept(sc);
			c1.setS1(c1.getS1());
			System.out.println(c1);
		}
		catch(ExceptionLineTooLong e){
			System.out.println("The strings is too long");
			e.printStackTrace();
		}
		

//		System.out.println(c1.toString());

	}

}
