package com.git.collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> mapMap = new HashMap<Integer, String>();
		mapMap.put(101, "Shri");
		mapMap.put(102, "Aayra");
		mapMap.put(103, "Shital");
		mapMap.put(104, "Diksha");
		
		Set<Integer> keySet = mapMap.keySet();
		for(Integer key :keySet) {
			System.out.println(key +" : "+ mapMap.get(key));
		}

	}

}
