package assignment1;
public class ArraySortAscending {

 

     public static void main(String[] args) {
            
            int arr[]= new int[] {60,0,35,70,18,1};
            
            
            System.out.println("Elements in array");
            for(int i=0; i<arr.length;i++) {
                System.out.print(arr[i]+ " ");
            }
            
            for (int i = 0; i < arr.length; i++)   
            {  
            for (int j = i + 1; j < arr.length; j++)   
            {  
            int tmp = 0;  
            if (arr[i] > arr[j])   
            {  
            tmp = arr[i];  
            arr[i] = arr[j];  
            arr[j] = tmp;  
            }  
            }  
            
            }  
              
            System.out.println();
            System.out.println("Sorted array in ascending order");
            for(int i=0; i<arr.length;i++)
            {
                System.out.print(arr[i]+ " ");
            }
        }
}