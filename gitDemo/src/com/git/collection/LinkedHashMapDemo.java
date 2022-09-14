package com.git.collection;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, String> hashMap = new LinkedHashMap<String, String>();
		hashMap.put("101", "Nanded");
		hashMap.put("102", "Bhokar");
		hashMap.put("104", "Pune");
		hashMap.put("106", "Nashik");
		
		Set<String> keySet = hashMap.keySet();
		
		for(String s :keySet) {
			System.out.println(s);
			System.out.println(hashMap.get(s));
		}
	}

}
