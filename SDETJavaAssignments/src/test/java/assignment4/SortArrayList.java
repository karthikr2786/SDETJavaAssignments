package assignment4;

import java.util.*;
public class SortArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		ArrayList output = new ArrayList();
	       
        output.add("Selenium");
        output.add("Training");
        output.add("Session");
       
        System.out.println("ArrayList elements before sorting - " + output);
       
        Collections.sort(output);
       
        System.out.println("ArrayList elements after sorting - " + output);
	}

}