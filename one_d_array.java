
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int input = sc.nextInt();
        
        int[] a = new int[input];
        System.out.println("enter the values: ");
        for(int j=0; j< input; j++){
             a[j] = sc.nextInt();
        }
        
        int sum=0;
        System.out.print("Array: [");
        for(int i =0; i<input; i++) {
            System.out.print(a[i]);
            if(i<a.length-1) {
                System.out.print(", ");
            } else {
                 System.out.println("]");
            }
            sum += a[i];
        }
       
        System.out.println("Sum: " + sum);
	}
}
