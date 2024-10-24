package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StdNameComparatorAsc implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}

class StdCityComparatorAsc implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getCity().compareTo(o2.getCity());
	}
}

class StdMarksComparatorDesc implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getMarks(), o1.getMarks());
	}
	
}


public class program01 {
	
	public static int menu(Scanner sc) {
		System.out.println("0. Exit ");
		System.out.println("1. Display All Students");
		System.out.println("2. Display Students sorted on rollnumber");
		System.out.println("3. Display Students sorted on Name Asc");
		System.out.println("4. Display Students sorted on City Asc");
		System.out.println("5. Display Students sorted on marks Desc");
		System.out.println("Enter choice :");
		return sc.nextInt();
	}
	
	public static void displayAllStudents(Student[] arr) {
		System.out.println("Before Sorting :");
	      for(Student s:arr) {
	    	  System.out.println(s);
	      }
	}

	public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
	
       Student[] arr=new Student[5];
       arr[0]=new Student(1,"Deependra","Gwalior",80);
       arr[1]=new Student(3,"Amit","Bhind",85);
       arr[2]=new Student(2,"rahul","Delhi",75);
       arr[3]=new Student(5,"pavan","Roorki",95);
       arr[4]=new Student(4,"Alkesh","Mehgoan",70);
       
       Comparator<Student> StdComparator;
       int choice;
       while((choice=menu(sc))!=0){
    	   switch(choice) {
    	   case 1:{
    		   displayAllStudents(arr);
    		   break;
    	   }
    	   case 2:
    	   {
    		   Arrays.sort(arr);
    		   displayAllStudents(arr);
    		   break;
    	   }
    	   case 3:
    	   {
    		   StdComparator=new StdNameComparatorAsc(); 
    		   Arrays.sort(arr,StdComparator);
    		   displayAllStudents(arr);
    		   break;
    	   }
    	   case 4:
    	   {
    		   StdComparator=new StdCityComparatorAsc(); 
    		   Arrays.sort(arr,StdComparator);
    		   displayAllStudents(arr);
    		   break;
    	   }
    	   case 5:
    	   {
    		   StdComparator=new StdMarksComparatorDesc(); 
    		   Arrays.sort(arr,StdComparator);
    		   displayAllStudents(arr);
    		   break;
    	   }
    	   }   	   
       }    
	}
}
