package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for(int i=0;i<elements.size();i++) {
			System.out.println(elements.get(i).getText());
		}
		System.out.println(elements.size());
		driver.quit();
		/*
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> linkedList=new LinkedList<Integer>();
		
		
		//list values
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//linked list values
		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(5);
		linkedList.add(7);
		linkedList.add(9);
		
		System.out.println(list);
		System.out.println(linkedList);
		
		list.remove(3);
		linkedList.remove(3);
		
		System.out.println("list"+list);
		System.out.println(linkedList);
		
		System.out.println(list.removeAll(linkedList));
		System.out.println(linkedList.removeAll(list));
		
		System.out.println(list);
		System.out.println(linkedList);
		
		
		//Set values
		Set<Integer> set1=new HashSet<Integer>();
		set1.add(40);
		set1.add(30);
		set1.add(10);
		set1.add(50);
		set1.add(30);
		System.out.println("HashSet"+set1);
		
		Set<Integer> set2=new LinkedHashSet<Integer>();
		set2.add(22);
		set2.add(11);
		set2.add(33);
		System.out.println("LinkedSet"+set2);
		
		Set<Integer> set3=new TreeSet<Integer>();
		set3.add(222);
		set3.add(111);
		set3.add(333);
		System.out.println("TreeSet"+set3);
		
		//to get set through List
		
		List<Integer> listSet=new ArrayList<Integer>(set1);
		
		System.out.println(listSet.get(2));
		
		for (Integer integer : listSet) {
			System.out.print("for each"+integer);
		}
		System.out.println();
		Collections.sort(listSet);
		for (Integer integer : set3) {
			System.out.println("for each sort list "+integer);
		}
		
		String a="Welcome1 to2 --> Testleaf3";
		System.out.println(a.substring(11,15));
		
		System.out.println(a.replaceAll("[a-zA-Z'", ""));*/
		
	}
	
	

}
