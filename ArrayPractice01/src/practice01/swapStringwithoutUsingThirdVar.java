package practice01;

public class swapStringwithoutUsingThirdVar {

	public static void main(String[] args) {
      String a = "hello";
      String b ="world";
      
      System.out.println("Before swapping a = " + a);
      System.out.println("Before swapping b = " + b);
      
      a = a+b;//helloworld   a.length=10
      
      b = a.substring(0, a.length()-b.length());//b.length=5 -->hello
      
      a = a.substring(b.length());//world
      
      System.out.println("After swapping ...");
      System.out.println("a = "+a+"\n"+ "b = "+b);


	}

}
