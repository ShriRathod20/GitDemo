package com.git.firstApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> noList = new ArrayList<Integer>();
		noList.add(10);
		noList.add(20);
		noList.add(30);
		noList.add(40);
		noList.add(50);

		for(int n :noList) {
			System.out.println(n);
		}
	}

}
