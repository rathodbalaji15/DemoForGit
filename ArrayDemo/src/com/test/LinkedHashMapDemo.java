package com.test;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
		map.put(101, "Balaji");
		map.put(102, "Mrunal");
		map.put(1010, "Ravi");
		map.put(1011, "Kiran");
		Set<Integer> set = map.keySet();
		for (Integer i : set) {
			System.out.println("key >>"+i);
			System.out.println("value >>"+map.get(i));
		}
	}

}
