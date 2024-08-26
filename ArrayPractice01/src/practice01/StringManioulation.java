package practice01;

public class StringManioulation {

	public static void main(String[] args) {
         String str = "The rains have started hare";
         String str1 = "The rains have started hare";
         
         System.out.println(str.length());
         
         System.out.println(str.charAt(10));
         
         System.out.println(str.indexOf('s'));
         
         System.out.println(str.indexOf( 'e', str.indexOf('e')+1));
         
         System.out.println(str.indexOf('e', 14));//20
         
         System.out.println(str.indexOf("Have"));//-1
         
         //String comparision
         System.out.println(str.equals(str1));
         
         System.out.println(str.equalsIgnoreCase(str1));
         
         System.out.println(str.contentEquals(str1));
         
         //substring
         System.out.println(str.substring(10));
         
         //trim
         String s = "   Hello world    ";
         System.out.println(s.trim());
         
         //split
         String str3 = "Hello how are you";
         String str3Val[] = str3.split(" ");
         for(int i=0; i<str3Val.length-1; i++){
        	 System.out.println(str3Val[i]);
         }
         
         //concadinate
         
         System.out.println(str3.concat("?"));
         
         String x= "hello";
         String y = "World";
         int a =10;
         int b=20;
         System.out.println(x+y+a+b);
         System.out.println(a+b+x+y);
	}

}
