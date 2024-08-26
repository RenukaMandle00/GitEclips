package practice01;

public class reverseInteger {

	public static void main(String[] args) {
		//1.using algo
         int num = 123456;
         int rev=0;
         
         while(num!=0) {
        	 rev = rev *10 +(num%10);
        	 num = num/10;
         }
         System.out.println(rev);
         
         //2.using string buffer
         int num1 = 456123789;
         System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
