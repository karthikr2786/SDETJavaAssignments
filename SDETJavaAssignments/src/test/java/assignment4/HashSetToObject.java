package assignment4;

import java.util.*;
public class HashSetToObject {

	public static void main(String[] args) {
		
		HashSet<String> output = new HashSet<String>();
	       
        output.add("selenium");
        output.add("training");
        output.add("session");
       
        System.out.println("HashSet elements - " + output);
        System.out.println("Object elements - ");
       
        Object[] input = output.toArray();
       
        for(int i = 0; i < input.length ; i++)
            System.out.println(input[i]);
	}

}