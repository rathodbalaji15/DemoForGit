package com.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Balaji","Sagar","Ramesh","Gopal");
		for (String s : list) {
			System.out.println(s);
		}
	}

}
