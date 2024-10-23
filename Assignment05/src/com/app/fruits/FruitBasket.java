package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	
	public static int menu(Scanner sc) {
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display All Fruits in the basket");
		System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale (optional)");
 	
		return sc.nextInt();
	}
      
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of basket :");
		int n=sc.nextInt();
		
		Fruit[] arr=new Fruit[n];
		
		int index=0;
		int choice;
		while((choice=menu(sc))!=0) {
			switch(choice) {
			
			case 1:
			{
				if (index<n) {
					arr[index]=new Mango();
					arr[index].accept(sc);
					index++;
					break;
				}
			}
			case 2:
			{
				if (index<n) {
					arr[index]=new Orange();
					arr[index].accept(sc);
					index++;
					break;
				}
			}
			case 3:
			{
				if (index<n) {
					arr[index]=new Apple();
					arr[index].accept(sc);
					index++;
					break;
				}
			}
			case 4:
			{
				System.out.println("===========================");
				for(Fruit e:arr) {
//					e.display();
					if((e.getName())!=null) {
					System.out.println("Fruit Name :"+e.getName()); 
					System.out.println("===========================");
					}
				}
				break;
			}
			case 5:
			{
				System.out.println("===========================");
				for(Fruit e:arr) {
					if((e.getName())!=null) {
//					e.display();
						System.out.println("Fruit :"+e.toString()); 
                         System.out.println("Taste :"+e.taste());
					
					System.out.println("===========================");
					}
				}
				break;
			}
			case 6:{
				for(Fruit e:arr) {
					if((e.isFresh()) == false) {
//						System.out.println("Fruit :"+e.toString()); 
                         System.out.println("Taste :"+e.taste());
					
					System.out.println("===========================");
					}
				}
				break;
			}
			case 7:{
			
				System.out.println("Enter Index of Fruit Store :");
				index=sc.nextInt();
				if(index<arr.length | index>0) {
				     arr[index].setFresh(false);
				}else {
					System.out.println("invalid input");
				}
                break;
			}
			case 8:{
				System.out.println("===========================");
				for(Fruit e:arr) {
					if(e.taste()=="sour")
					System.out.println("Fruit Name :"+e.getName()); 
					System.out.println("===========================");
					}
				}
				break;
				
			}
			}
		}

		
		
	}

