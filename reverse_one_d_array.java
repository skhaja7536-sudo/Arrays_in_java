
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
        

        System.out.print("Original Array: [");
        for(int i =0; i<input; i++) {
            System.out.print(a[i]);
            if(i<a.length-1) {
                System.out.print(", ");
            } else {
                 System.out.println("]");
            }
        }
        
        int b= input-1;
        int[] revesarr = new int[input];
        for(int n = 0; n<revesarr.length; n++){
            revesarr[n] = a[b];
            b--;
        }
        
        System.out.print("Reversed array: [");
        
        for(int k =0;  k< revesarr.length; k++) {
            System.out.print(revesarr[k]);
            if(k<revesarr.length-1){
                System.out.print(", ");
            }else{
                System.out.println("]");
            }
            
        }
	}
}
