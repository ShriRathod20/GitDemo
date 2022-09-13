package com.git.firstApp;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> noSet = new HashSet<Integer>();
		noSet.add(11);
		noSet.add(12);
		noSet.add(11);
		noSet.add(13);
		
		System.out.println(noSet);

	}

}
