package Demo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>(); 
		ll.add("A");
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		System.out.println(ll);
		Collections.sort(ll, Collections.reverseOrder());
		System.out.println(ll);
	}

}
