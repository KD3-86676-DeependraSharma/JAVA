package com.app.geomertry;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Point2D p1=new Point2D(1,2);
          
          System.out.println("X,y co-ordinates of point 1 is:"+ p1.getDetails());
         
//          p1.Display();
         
          Point2D p2=new Point2D(2,3);
          
          System.out.println("X,y co-ordinates of point 2 is:"+ p2.getDetails());
        
//          p2.Display();
          
          
          if(p1.equals(p2)) {
        	  
        	  System.out.println("Points are equal area is :"+p1.calculateDistance(p2));
          }
          else {
        	  
        	  System.out.println("Distance betwwen two points is :"+ p1.calculateDistance(p2));
          }
	}

}
