package com.app.fruits;

import java.util.Scanner;

public class Mango extends Fruit{
	String taste;

	public Mango()
	{
		super("Mango");
//		name="mango";
	}
	
	public Mango(String taste) {
		super("Mango");
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
//		super.getName();
	}
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet";
	}

}