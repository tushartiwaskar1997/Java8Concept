package example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		
		List<Integer> numberlist  =  new ArrayList<>();
		numberlist.add(1);
		numberlist.add(2);
		numberlist.add(3);
		numberlist.add(4);
		numberlist.add(5);
		numberlist.add(6);
		numberlist.add(7);
		numberlist.add(8);
		numberlist.add(9);
		numberlist.add(10);
		List<Integer>  evenlist_traditional =  new ArrayList<>();
		for (Integer num : numberlist) {
			if(num%2==0)
			{
				evenlist_traditional.add(num);
			}
		}
		System.out.println("even list calculation using the traditional methiod "+ evenlist_traditional);
		
		List<Integer> streamevenlist =  numberlist.stream().filter(num ->num%2==0).collect(Collectors.toList());
		System.out.println("even list using the stram api "+streamevenlist);
		
		List<Integer> sortthelist =  new ArrayList<>();
		sortthelist.add(10);
		sortthelist.add(44);
		sortthelist.add(1);
		sortthelist.add(7);
		sortthelist.add(4);
		sortthelist.add(9);
		sortthelist.add(9);
		sortthelist.add(5);
		sortthelist.add(8);
		sortthelist.add(0);
		List<Integer>  result =  sortthelist.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted list using the stream "+result);
		

		List<Integer> adding5ineveryelement =  new ArrayList<>();
		adding5ineveryelement.add(10);
		adding5ineveryelement.add(15);
		adding5ineveryelement.add(20);
		adding5ineveryelement.add(25);
		adding5ineveryelement.add(30);
		adding5ineveryelement.add(35);
		adding5ineveryelement.add(40);
		
		List<Integer>  addintionresult  = adding5ineveryelement.stream().map(num->num+5).collect(Collectors.toList());
		System.out.println("this is the list before operatoin        "+adding5ineveryelement);
		System.out.println("this is the list after the additon of 5  "+addintionresult);
		
	}
	
	
}
