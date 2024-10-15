import java.util.Scanner;

public class Assign2_Q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
     System.out.print("Enter int Number :");
     int a=sc.nextInt();
     System.out.println("Given Number :"+a);
     
     //Binary 
     String bn=Integer.toBinaryString(a);
     //toOctalString
     String oc=Integer.toOctalString(a);
     //toHexString
     String oh=Integer.toHexString(a);
     
     System.out.println("Binary convert string :"+bn);
     System.out.println("octal convert string :"+oc);
     System.out.println("Hex convert string :"+oh);
  }

}
