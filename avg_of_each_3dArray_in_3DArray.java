
 import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Hello World");
		
		System.out.println("enter depth: ");
		int a = sc.nextInt();
		
		System.out.println("enter no of rows: ");
		int b =sc.nextInt();
		
		System.out.println("enter no.of columns: ");
		int c = sc.nextInt();
		
		int[][][] arr = new int[a][b][c];
		
				System.out.println("Taking user inputs: ");
		for(int i =0; i< a; i++) {
		    for(int j =0; j<b; j++){
		        for(int k=0; k<c; k++){
		           arr[i][j][k] = sc.nextInt();
		        }
		    }
		}
		
		
		System.out.println("3D Array: ");
		for(int i =0; i< a; i++) {
		 	System.out.println("Layer " + (i+1) + ":");
            for(int j =0; j<b; j++){
		        for(int k=0; k<c; k++){
		           System.out.print(arr[i][j][k] + " ");
		        }
		        System.out.println();
		    }
		}
		
		
	
		    for(int j =0; j<b; j++){
		       
		        for(int k=0; k<c; k++){
		           	 double sum = 0;
		        	for(int i =0; i< a; i++) {
		        	    sum += arr[i][j][k];
		        } 
		        
		        System.out.println("average: (" + j+", " + k + " ): " + (sum / a));

		    }
		}
		
	}
}
