import java.util.Scanner;

public class Invoice {
  String part;
  String a_part_description;
  int Qty_purchesed;
  double price_item;
  double Total_Amount;
  
  public Invoice() {
	  this("mouse","says",2,10);
  }

public Invoice(String part, String a_part_description, int qty_purchesed, double price_item) {
	
	this.part = part;
	this.a_part_description = a_part_description;
	Qty_purchesed = qty_purchesed;
	this.price_item = price_item;
}

public String getPart() {
	return part;
}

public void setPart(String part) {
	this.part = part;
}

public String getA_part_description() {
	return a_part_description;
}

public void setA_part_description(String a_part_description) {
	this.a_part_description = a_part_description;
}

public int getQty_purchesed() {
	return Qty_purchesed;
}

public void setQty_purchesed(int qty_purchesed) {
	Qty_purchesed = qty_purchesed;
}

public double getPrice_item() {
	return price_item;
}

public void setPrice_item(double price_item) {
	this.price_item = price_item;
}


public void Accept()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter part name :");
	part=sc.next();
	
	System.out.println("Enter part Discription :");
	a_part_description=sc.next();
	
	System.out.println("Enter part Qty purchase :");
	Qty_purchesed=sc.nextInt();
	
	System.out.println("Enter part Price :");
	price_item=sc.nextDouble();
	
}

public void Display()
{
	System.out.println("part name :"+part);
	
	System.out.println("part Discription :"+a_part_description);
	if(Qty_purchesed>0) {
	System.out.println("Qty purchase :"+Qty_purchesed);
	}
	
	else 
	{
		System.out.println("Qty purchase :"+0);
	}
	
	if(price_item>0) {
		System.out.println("Price :"+price_item);
		}
		
		else 
		{
			System.out.println("Price :"+0.0);
		}
	
	System.out.println("Total Amount :- "+(Qty_purchesed*price_item));
	
}
  
  
}
