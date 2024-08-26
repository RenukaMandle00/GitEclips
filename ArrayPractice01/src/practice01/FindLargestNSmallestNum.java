package practice01;

import java.util.Arrays;

public class FindLargestNSmallestNum {

	public static void main(String[] args) {
   int num[] = {12, -89, -45, 789, 23, 456, 98987787, -78945};
   
   int large = num[0];
   int small = num[0]; 
   
   for(int i=0; i<=num.length-1; i++) {
	   if(num[i]>large) {
		   large = num[i];
	   }
	   else if(num[i]<small) {
		   small = num[i];
	   }
   }
   System.out.println("Given array is.."+ Arrays.toString(num) +" ");
   System.out.println("the largest number is..."+large);
   System.out.println("the smallest number is..."+small);

	}

}
