package practice01;

public class RemoveJunk {

	public static void main(String[] args) {
       String s = "2342434 @#$@#@$^&% selenium 90 java";
       s= s.replaceAll("[^a-zA-Z]", "");
       System.out.println(s);
	}

}
