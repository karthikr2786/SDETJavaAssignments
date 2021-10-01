package assignment3;

import java.util.Scanner;

public class ContainsBrown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);  
        System.out.print("Enter a sentence - ");
        String str = scan.nextLine(); 
        
        System.out.print(str.contains("brown") ? "Result - '"+ str +"' contains word 'brown'.": 
        	"Result - '"+ str +"' doesn't contain word 'brown'.");

	}

}