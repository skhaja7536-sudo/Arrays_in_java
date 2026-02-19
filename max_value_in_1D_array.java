
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size here: \n");
	  int a = sc.nextInt();
	   int[] arr = new int[a];
	   System.out.println("enter the array values here");
	  for(int i=0; i<a; i++) {
	      arr[i] = sc.nextInt();
	  }
     
     System.out.print("Array: [");
     for(int i =0; i<a; i++){
         System.out.print(arr[i]);
         if(i<a-1){
             System.out.print(", ");
         }else {
             System.out.println("]");
         }
     }
     
     int max = arr[0];
     for(int i=0; i<a; i++) {
         if(max< arr[i]){
             max = arr[i];
         }
     }
	    System.out.println("Max value: " +max);
	}
}
