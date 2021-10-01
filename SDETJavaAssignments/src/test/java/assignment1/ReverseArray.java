package assignment1;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  
        System.out.print("Enter size of the array - ");
        int n = input.nextInt(); 
        
        int arr[] = new int[n];
        for(int i = 1; i <= n; i++){
        	System.out.print("Enter element "+i+" - "); 
            arr[i-1] = input.nextInt();
        }
        
        System.out.print("Reverse order result - ");
        for(int i = arr.length-1;i>=0;i--) {
        	System.out.print(arr[i]+" ");
        }

	}


}
