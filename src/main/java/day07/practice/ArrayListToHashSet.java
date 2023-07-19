package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListToHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(5);
		
		Set<Integer> set = new HashSet(list);
		
		System.out.println(set);
		
	}

}
