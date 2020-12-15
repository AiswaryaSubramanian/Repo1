package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ListExample {

	public void list() {
		// TODO Auto-generated method stub
		
		List<String> al = new ArrayList<String>(); 
		
		al.add("e");  
        al.add("b"); 
        al.add("c"); 
        al.add("1");
        System.out.println(al);
//        al.remove(1);
//        System.out.println(al);
        
//        for (int i = 0; i < al.size(); i++) { 
//        	  
//            System.out.print(al.get(i)+"\n"); 
//        }
//        //using Iterator
        //Collections.sort(al);//ascending order
        Collections.sort(al, Collections.reverseOrder());//descending order
        Iterator<String> itr = al.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        //reverse order using iterator
        
//        ListIterator<String> itr = al.listIterator(al.size());
//        while(itr.hasPrevious())
//        {
//        	System.out.println(itr.previous());
//        }

	}

}
