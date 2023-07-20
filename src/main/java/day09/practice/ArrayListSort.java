package day09.practice;

import java.util.*;
public class ArrayListSort {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(8);
		list.add(9);
		list.add(45);
		list.add(12);
		list.add(1);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}
