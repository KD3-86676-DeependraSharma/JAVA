import java.util.Scanner;

public class Assign2_Q_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		int bill=0;
       do 
       {
    	 System.out.println("1.Dosa\n2.Samosa\n3.idli\n4.bdapao\n5.pizza\n6.paties\n7.panipuri\n8.bhelpuri\n9.momos\n10.GenerateBill\n11.Exit");
    	  
    	 System.out.println("Enter choice :");
    	 choice=sc.nextInt();
    	 System.out.println(choice);
    	  
    	
    	  switch (choice)
    	  {
    	     case 1:
    	     {
    		    System.out.println("Dosa");
    		    int price=50;
    		    bill=bill+price;
    		    break;
    	     }
    	     case 2:
    	     {
    		    System.out.println("Samosa");
    		    int price=20;
    		    bill=bill+price;
    		    break;
    	     }
    	     case 3:
    	     {
    		    System.out.println("idli");
    		    int price=25;
    		    bill=bill+price;
    		    break;
    	     }
    	     case 4:
    	     {
    		    System.out.println("bdapao");
    		    int price=25;
    		    bill=bill+price;
    		    break;
    	     }
    	     case 5:
    	     {
    		    System.out.println("Pizza");
    		    int price=150;
    		    bill=bill+price;
    		    break;
    	     }
    	     case 6:
    	     {
    		    System.out.println("paties");
    		    int price=20;
    		    bill=bill+price;
    		    break;
    	     }
    	     case 7:
    	     {
    		    System.out.println("Panipuri");
    		    int price=20;
    		    bill=bill+price;
    		    break;
    	     }
    	     case 8:
    	     {
    		    System.out.println("bhelpuri");
    		    int price=30;
    		    bill=bill+price;
    		    break;
    	     }
    	     case 9:
    	     {
    		    System.out.println("momos");
    		    int price=50;
    		    bill=bill+price;
    		    break;
    	     }
    	     case 10:
    	     {
    		    System.out.println("Your bill");
    		    System.out.println("Total :"+bill);
    		    System.out.println("Thanku for using app");
    		    break;
    	     }
 	         default:
 	         {
 		        System.out.println("Thanku for using app");
 		        choice=5;
 		        break;
 	         }

    	  }
    	  
       }while(choice!=10);

	}

}
