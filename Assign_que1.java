import java.util.Scanner;

public class Assign_que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double n1;
      double n2;
      double avg;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter num 1 :");
      if(sc.hasNextDouble() &&! sc.hasNextInt())
      {
    	  n1=sc.nextDouble();
    	  
          System.out.println("Enter num 2 :");
    	  if(sc.hasNextDouble() &&! sc.hasNextInt())
    	  {
    		  n2=sc.nextDouble();
    		  
    		  avg=(n1+n2)/2;
    		  System.out.println("Avg :"+avg);
    				  
    	  }
    	  else
    	  {
    		  System.out.println("Error");
    	  }
    	  
      }
      else
      {
    	  System.out.println("Error");
      }
	}

}
