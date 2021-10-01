package assignment1;
import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Area height: ");
		double height=input.nextInt();
		
		System.out.println("Enter the Area breadth: ");
		double base =input.nextInt();
		
		double area = ((height*base)/2);
		System.out.println("Area of triangle is :"+area);
		

	}

}