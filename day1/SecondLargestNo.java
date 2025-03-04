package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNo {

	public static void main(String[] args) {
		int[] num={3, 2, 11, 4, 6, 7};
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
		System.out.println("Second largest number: "+list.get(size-2));
	}

}
