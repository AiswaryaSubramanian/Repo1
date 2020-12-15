package Demo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new TreeMap<>();

		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);
		

		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator(); 
        
        while(itr.hasNext()) 
        { 
             Map.Entry<String, Integer> entry = itr.next(); 
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue()); 
        } 
	}

}
