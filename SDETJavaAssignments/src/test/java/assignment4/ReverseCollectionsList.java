package assignment4;

import java.util.*;
public class ReverseCollectionsList {
	
	public static void main(String[] args) {
		
		  List<String> output = new ArrayList<String>();

	        output.add("Selenium");

	        output.add("TestNG");

	        output.add("cucumber");

	        

	        System.out.println("Elements before reversing - " + output);

	        

	        Collections.reverse(output);  

	        System.out.println("Elements after reversing - " + output);
	}

}