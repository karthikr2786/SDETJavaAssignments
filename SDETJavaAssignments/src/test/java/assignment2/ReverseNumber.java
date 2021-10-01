package assignment2;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
        System.out.print("Enter a number - ");
        int num = scan.nextInt(); 
        int reverse = 0;
        while(num != 0) {
        	int rem = num%10;
        	reverse = reverse * 10 + rem;
        	num = num / 10;
        }
        System.out.print("Reverse of the given number - "+ reverse);

	}


}