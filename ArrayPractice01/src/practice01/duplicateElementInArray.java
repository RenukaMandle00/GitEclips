package practice01;

import java.util.*;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateElementInArray {

	public static void main(String[] args) {
         String arr[] = {"java", "c","c#", "python", "js", "java", "c"};
       //1. worst case O(n*n)  
         for(int i=0; i<=arr.length-1; i++) {
        	 for(int j=i+1; j<=arr.length-1; j++) {
        		 if(arr[i].equals(arr[j])) {
        			 System.out.println("Duplicate element is.." + arr[i]);
        		 }
        	 }
         }         
         System.out.println("---------------------------------------");
         
         //2. hashset O(n)
         
         Set<String> store= new HashSet<String>();
         for(String name : arr) {
        	 if(store.add(name) == false){
           System.out.println("Duplicate element is..."+name);
        	 }
         }
         System.out.println("---------------------------------------");
         
         //3. using HashMap
         Map<String, Integer> storeMap = new HashMap<String, Integer>();
         
         for(String name : arr) {
        	 Integer count = storeMap.get(name);
        	 if(count == null) {
        		 storeMap.put(name, 1);
        	 }else {
        		 storeMap.put(name, ++count);
        	 }
         }
         //get the value from this hashmap
         Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
         for(Entry<String, Integer> entry : entrySet) {
        	 if(entry.getValue()>1) {
        		 System.out.println("Duplicate element is..."+ entry.getKey());
        	 }
         }
	}

}
