package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindMissingElement {
	public static void main(String[] args) {
		int[] num={1, 2, 3, 4, 10, 6, 8};
		List<Integer> list=new ArrayList<Integer>();

		for(int i=0;i<num.length;i++) {
			list.add(num[i]);
		}
		Collections.sort(list);
		System.out.print("Sorted List Values:");
		for (Integer integer : list) {
			System.out.print(integer+" ");
		}
		int size = list.size();
		System.out.println();
		System.out.print("Missing Values: ");
		for(int i=0;i<size-1;i++) {
			if(list.get(i)+1!=list.get(i+1))
			System.out.print(list.get(i)+1+" ");
		}
		//System.out.println("Second largest number: "+list.get(size-2));
	}

}
