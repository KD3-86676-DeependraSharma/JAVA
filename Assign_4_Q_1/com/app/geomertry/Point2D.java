package com.app.geomertry;

import java.util.Scanner;

public class Point2D {
 
	int x;
	int y;
	
	public Point2D() {
       this(1,1);
	}
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String getDetails()
	{
		return "Point2D [x:"+x+",y:"+y+"]";
	}
	
	public boolean isEqual(Point2D p2)//this-> p1
	{
          return this.x==p2.x && this.y==p2.y;
		
	}
	public double calculateDistance(Point2D p2)// this->p1	
	{
		if(this.x==p2.x && this.y==p2.y)
		{
//			System.out.println("x1"+this.x+"y1"+p.y);
			return 0;
		}
		else
		{
		   double dist=Math.sqrt(Math.pow((this.x-p2.x),2)+Math.pow((this.x-p2.x),2));
		   return dist;
		}
	}
	public void accept() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x point");
		x=sc.nextInt();
		
		System.out.println("Enter y point");
		y=sc.nextInt();
		
	}
//	public void Display()
//	{
//		System.out.println("x :"+x);
//		
//		System.out.println("y :"+y);
//	}
	
}
