package practice01;

import java.util.Scanner;

public class RotationOfArray {

	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter size of array");
      int arr[] = new int[scan.nextInt()];
      
      System.out.println("Enter Elements of arrays");
      for(int i=0; i<=arr.length-1; i++) {
    	  arr[i] = scan.nextInt();
      }
      
      System.out.println(" array is ...");
  	for(int i=0; i<=arr.length-1; i++) {
    	  System.out.print(arr[i] + " ");
  	}
      System.out.println();
      System.out.println("Enter how many times you want rotate");
      int k = scan.nextInt();
      
      for(int j=0; j<k; j++) {
      int first = arr[0];
      for(int i=0; i<=arr.length-2; i++) {
    	  arr[i] = arr[i+1];
      }
      arr[arr.length-1] = first;
      
      }
      System.out.println("rotaion array is ...");
	for(int i=0; i<=arr.length-1; i++) {
  	  System.out.print(arr[i] + " ");
    }
	

}
}
