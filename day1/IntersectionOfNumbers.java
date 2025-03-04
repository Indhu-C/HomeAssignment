package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfNumbers {

	public static void main(String[] args) {
		int[] no1={3, 2, 11, 4, 6, 7};
		int no2[]={1, 2, 8, 4, 9, 7};
		
		//Compare both the arrays
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		
		//Add array elements to a list
		
		for(int i=0;i<no1.length;i++) {
			list1.add(no1[i]);
		}
		for(int j=0;j<no2.length;j++) {
			list2.add(no2[j]);
		}
		System.out.print("List1 items:");
		for (Integer integer1 : list1) {
			System.out.print(integer1+" ");
		}
		System.out.println();
		System.out.print("List2 items:");
		for (Integer integer2 : list2) {
		System.out.print(integer2+" ");
		}
		System.out.println();
		System.out.print("Common items:");
		//Print the values if they are equal
		for (int k = 0; k < no1.length; k++) {
			if(list1.get(k).equals(list2.get(k)))
					System.out.print(list1.get(k)+" ");	
		}
	}

}
