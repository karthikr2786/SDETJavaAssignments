package assignment1;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int inputNumber=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the fibonacci series of input Number - ");
		inputNumber= scanner.nextInt();
		System.out.print("Enter the fibonacci series of "+inputNumber+" term - ");
		

		
		int firstdigit=0;
		int seconddigit=1;
		
		for(int i=1; i<=inputNumber;i++)
		{
			System.out.print(firstdigit+",");
			 int nextdigit=firstdigit + seconddigit;
			 firstdigit=seconddigit;
			 seconddigit=nextdigit; 
		}
		

}
}