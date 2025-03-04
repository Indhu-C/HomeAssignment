package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] company ={"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> list=new ArrayList<String>();
		for(int i=0;i<company.length;i++)
		list.add(company[i]);
		
		System.out.print("Given Company Names:  ");
		for (String string : list) {
			System.out.print(string+" ");
		}
		System.out.println();
		Collections.sort(list);
		System.out.print("Company Names in alphabetical order:  ");
		for (String str : list) {
			System.out.print(str+" ");
		}
		System.out.println();
		System.out.print("Company Names in reversed alphabetical order:  ");
		
		for (int i = list.size()-1; i >=0; i--) {
			
			System.out.print(list.get(i)+" ");
		}
	}

}
