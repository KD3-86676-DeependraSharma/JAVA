package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruit{
	String taste;

	public Apple()
	{
		super("Apple");
	}
	
	public Apple(String taste) {
		super("Apple");
		this.taste = taste;
	}
	


	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public void accept(Scanner sc) {
		
		super.accept(sc);
		
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet and Sure";
	}

}
