package p1;

import java.util.Scanner;

public class Employee {
 
	String firstName;
	String lastName;
	double salary;
	
public Employee() {
	this("Rahul","Sharma",50000);
}

public Employee(String firstName, String lastName, double salary) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}
//public double upDatedSalary() {
//	double sal=(salary*12)*1.1;
//	double msal=sal/12;
//	return sal;
//}

public void Accept()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter firstName :");
	firstName=sc.next();
	
	System.out.println("Enter lastName :");
	lastName=sc.next();
	
	System.out.println("Enter salary :");
	salary=sc.nextInt();
	
	
}

public void Display()
{
	System.out.println("FirstName :"+firstName);
	System.out.println("LastName :"+lastName);
	if(salary>0)
	{
//	   double sal=salary;
		double sal=(salary*12)*1.1;
		double msal=sal/12;
	   System.out.println("Yearly Salary :"+sal);
	   System.out.println("Monthly Salary :"+msal);
	}
	else {
		   double sal=0;
		   System.out.println("Salary :"+sal);
	}
}

}
