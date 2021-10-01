package assignment1;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		
		System.out.print("Enter the year - ");
		Scanner inputYear= new Scanner(System.in);
		int n ;
		
		n =inputYear.nextInt();
		
		inputYear.close();
		
		if ((n%4==0)&& (n%100!=0) || (n%400==0))
		{
			System.out.println("Leap year");
		}
		else
			System.out.println("Not a leap year");
		
				
				

	}

}