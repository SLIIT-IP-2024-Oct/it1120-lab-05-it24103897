import java.util.Scanner;
public class IT24103897Lab5Q3
{
public static final double ROOMCHARGEPERDAY = 48000.00;
public static final int DISCOUNTRATE3TO4DAYS = 10;
public static final int DISCOUNTRATE5ORMOREDAYS = 20;

public static void main(String args[])
{
Scanner input = new Scanner(System.in);

System.out.print("Enter the start date of the reservation (1-31): ");
int startDate = input.nextInt();

System.out.print("Enter the end date of the reservation (1-31): ");
int endDate = input.nextInt();

if(startDate<1 || startDate>31 || endDate<1 || endDate>31)
{
	System.out.print("Error! Start date and end date must be between 1 and 31. ");
	return;
}

int numberOfDays = endDate - startDate;
int discountRate = 0; 

if (numberOfDays == 3 || numberOfDays == 4)
{
	discountRate = DISCOUNTRATE3TO4DAYS;
}
else if (numberOfDays >= 5)
{
	 discountRate = DISCOUNTRATE5ORMOREDAYS;
}

double totalAmount = numberOfDays * ROOMCHARGEPERDAY;
double discount = totalAmount * discountRate/100;
double finalAmount = totalAmount - discount;

System.out.println("Enter start date: " + startDate);
System.out.println("Enter end date: " + endDate);
System.out.println("Room charge per day : " + ROOMCHARGEPERDAY);
System.out.println("Number of days Reserved : " + numberOfDays);
System.out.println("Total Amount to be paid: " + finalAmount);

}
}


