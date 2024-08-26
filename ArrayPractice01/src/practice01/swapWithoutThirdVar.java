package practice01;

public class swapWithoutThirdVar {

	public static void main(String[] args) {
      // using third operation t
		int t;
		int a=10;
		int b=20;
//		t=a;
//		a=b;
//		b=t;
		
		// 1. using + operator
		
//		a= a+b;
//		b=a-b;
//		a=a-b;
		
		// 2. using * operator
		
//		a= a*b;
//		b=a/b;
//		a=a/b;
		
		//3. using xor ^ operator

		a= a^b;
		b=a^b;
		a=a^b;
		
		
		System.out.println("a = " + a);
		System.out.println("b = " +b);
	}

}
