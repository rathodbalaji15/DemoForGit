package com.test;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(0);
		set.add(null);
		set.add(10);
		for (Integer i : set) {
			System.out.println(i);
			
		}
		

	}

}
