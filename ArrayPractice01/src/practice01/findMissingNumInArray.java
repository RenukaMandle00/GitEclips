package practice01;

import java.util.Arrays;
import java.util.Scanner;

public class findMissingNumInArray {

	public static void main(String[] args) {
     
	int arr[] = {-1,10,1,4,6,8,5,7,2,9};
      
       Arrays.sort(arr);
      System.out.println(arr);
      
      int sum =0;
      for(int i=0; i<=arr.length-1;i++) {
    	 sum =sum+arr[i];  
      }
      int sum1=0;
      for(int i=0; i<=11;i++) {
     	 sum1 =sum1+i;  
       }
      
      System.out.println("missing number is..." + (sum1-sum));
	}

}
