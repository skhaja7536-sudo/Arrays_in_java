
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size here: \n");
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  
	   int[][] arr = new int[a][b];
	   System.out.println("enter the array values here");
	  for(int i=0; i<arr.length; i++) {
	      System.out.print("row " +(i+1) + "values: ");
	      for(int j=0; j<b; j++){
	          arr[i][j] = sc.nextInt();
	      }
	  }
     System.out.println();
     
     
    //  System.out.print("Array: [");
     for(int i =0; i<arr.length; i++){
         for(int j =0; j<b; j++) {
             System.out.print(arr[i][j] + " ");
         }
         System.out.println();
        
     }
     
     int sum = 0;
      for(int i =0; i<arr.length; i++){
          int min = arr[i][0];
         for(int j =0; j<b; j++) {
            if(min > arr[i][j]){
                min = arr[i][j];
            }
         }
         System.out.println("Minimum of row " + (i+1) + ": " + min);
         sum += min;
      }
         System.out.println("Sum of minimum elements: " + sum);
	}
}
