package practice01;

import java.util.Scanner;

public class ReverseRotation {

	public static void main(String[] args) {
              Scanner scan = new Scanner(System.in);
              System.out.println("Enter length of array");
              int arr[] = new int [scan.nextInt()];
              
              System.out.println("Enter the elements of array");
              for(int i=0; i<=arr.length-1; i++) {
            	  arr[i] = scan.nextInt();
              }
            
              System.out.println("Array is....");
              for(int i=0; i<=arr.length-1; i++) {
                   System.out.print(arr[i]+" ");
                   
              }
              
              System.out.println();
              System.out.println("Enter how many times you want to rotate");
              int k = scan.nextInt();
          
              for(int i=0; i<k; i++) {
                    int first = arr[arr.length-1];
                    for(int j=arr.length-2; j>=0; j--) {
                    	arr[j+1] = arr[j];
                    }
                    arr[0] =first;
             }
              
              System.out.println("After rotation Array is....");
              for(int i=0; i<=arr.length-1; i++) {
                   System.out.print(arr[i]+" ");
                   
              }

              
	}

}
