package Demo;

import java.util.Arrays;
import java.util.Collections;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] Arr1 = {45,23,78,94,11};
		
		//To print Ascending order
		Arrays.sort(Arr1);
		for(int i=0;i<Arr1.length;i++)
		{
			int arr = Arr1[i];
		    System.out.println(arr);
		}
		
		System.out.println("\n");
		
		//To print descending order
		Arrays.sort(Arr1,Collections.reverseOrder());
//		for(int i=0;i<Arr1.length;i++)
//		{
//			int arr = Arr1[i];
//		    System.out.println(arr);
//		}
		System.out.printf("Modified arr[] : "+Arrays.toString(Arr1));
	}

}
