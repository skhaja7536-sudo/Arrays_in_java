
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size here: \n");
	  int a = sc.nextInt();
	   int[] arr = new int[a];
	   System.out.println("enter the array values here");
	  for(int i=0; i<arr.length; i++) {
	      arr[i] = sc.nextInt();
	  }
     
     System.out.print("Array: [");
     for(int i =0; i<arr.length; i++){
         System.out.print(arr[i]);
         if(i<arr.length-1){
             System.out.print(", ");
         }else {
             System.out.println("]");
         }
     }
     int sum = 0;
     for(int i=0; i<arr.length; i++) {
         if(arr[i] % 2 == 0){
             sum += arr[i];
         }
     }
	    System.out.println("Sum of even numbers: " + sum);
	}
}
