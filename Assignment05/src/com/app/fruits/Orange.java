package com.app.fruits;

import java.util.Scanner;

public class Orange extends Fruit{
	String taste;

	public Orange()
	{
		super("Orange");
	}
	
	public Orange(String taste) {
		super("Orange");
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
		return "sour";
	}

}