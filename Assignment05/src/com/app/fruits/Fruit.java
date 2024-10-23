package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {
	
	String name;
	String color;
	double weight;
	boolean isFresh=true;
	
	public Fruit() {
		
	}

	public Fruit(String name) {
		this.name = name;
	}

	public Fruit(String name, String color, double weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public void accept(Scanner sc)
	{
//		System.out.println("");
		
		System.out.println("Enter Color :");
		color=sc.next();
		
		System.out.println("Enter weight :");
		weight=sc.nextDouble();
		
	}
//	public void display() {
//		System.out.println("Fruit Name :"+name);
//		System.out.println("Fruit Color :"+color);
//		System.out.println("Fruit weight :"+weight);
//		System.out.println("Fruit is Fresh :"+isFresh);
//
//	}
	
	public abstract String taste();

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}
	
}
