package Demo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//adding 2 list values and print without duplicate values
//		String[] Arr1 = {"A","B","C","E","E"};
//		String[] Arr2 = {"F","G","H","J","J"};
//		List<String> str1= Arrays.asList(Arr1);
//		List<String> str2= Arrays.asList(Arr2);
//		Set<String> join = new HashSet<String>(); 
//		join.addAll(str1);
//		join.addAll(str2);
//		System.out.println(join);
				
		Set<String> h = new TreeSet<String>(); 

		// Adding elements into the HashSet 
		// using add() 
		h.add("India"); 
		h.add("Australia"); 
		h.add("South Africa"); 

		// Adding the duplicate 
		// element 
		h.add(""); 

		// Displaying the HashSet 
		System.out.println(h); 

		// Removing items from HashSet 
		// using remove() 
		//h.remove("Australia"); 
		//System.out.println("Set after removing "+ "Australia:" + h); 

		// Iterating over hash set items 
		System.out.println("Iterating over set:"); 
		Iterator<String> i = h.iterator(); 
		while (i.hasNext()) 
			System.out.println(i.next());
		
		//To iterate in reverse order using descendingIterator
		//h.remove("1");
//		LinkedList<String> list = new LinkedList<>(h);
//		Iterator<String> itr = list.descendingIterator();
//		while (itr.hasNext()) 
//			System.out.println(itr.next());
        
		
	} 

}
