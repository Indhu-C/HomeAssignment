package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicateWords {
	public static void main(String[] args) {

		String test = "We learn Java basics as part of java sessions in java week1";
		String  result = "";
		int count = 0;
		System.out.println("Original Sentence: " + test);
		//- Split the text into an array of words using space as the delimiter
		String[] ip = test.split(" ");
		
		//- Create two nested for loops to compare each word with every other word in the String array.
		for(int i=0; i<ip.length; i++) {
			for(int j=i+1; j<ip.length; j++) {
				if(ip[i].equalsIgnoreCase(ip[j])) {
					ip[j] = "---";
					
					count++;
				}
			}
		}
		// Convert to String
		if(count!=0) {
		for(String word: ip) {
			if(word != "---") {
				result = result + word + " ";
			}
			else {
				result = result  + "   ";
			}
		}
		}
		// duplicates replaced with empty strings.
		System.out.println("\nAfter removing duplicate words: " + result);

	}

}

