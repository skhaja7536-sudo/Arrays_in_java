import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);   
       int a =sc.nextInt();
       int b =sc.nextInt();

       int[][] arr = new int[a][b];

       for(int i=0; i<a; i++) {
        for(int j=0; j<b; j++) {
            arr[i][j] = sc.nextInt();
        }
       }


       System.out.println("Original Matrix: ");
       for(int i=0; i<a; i++) {
        for(int j=0; j<b; j++) {
           System.out.print(arr[i][j] + " ");
        }
        System.out.println();
       }
       System.out.println();



       int[][] trans = new int[b][a];
       for(int i=0; i<a; i++) {
        for(int j=0; j<b; j++) {
            trans[j][i] = arr[i][j];
        }
       }

       System.out.println("Transpose of matrix: ");
       for(int i=0; i<b; i++) {
        for(int j=0; j<a; j++) {
           System.out.print(trans[i][j]+ " ");
        }
        System.out.println();
       }
     
   }
 }
