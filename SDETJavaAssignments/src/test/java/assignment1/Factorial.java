package assignment1;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		

		System.out.println("Enter the number: ");
		
		Scanner scanner= new Scanner(System.in);
		int inputNumber= scanner.nextInt();
		
		int i=1;
		int fact=1;
		while(i<=inputNumber)
		{
			fact= fact *i;
			i++;
			
		}
		System.out.println("factorial of"+" "+inputNumber+" "+"is :"+fact);

	}

}