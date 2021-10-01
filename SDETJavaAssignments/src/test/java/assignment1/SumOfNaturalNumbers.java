package assignment1;
import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number - ");
		int num = scan.nextInt();
		int result = (num * (num + 1))/2;
		System.out.print("Result - " + result);

	}

}