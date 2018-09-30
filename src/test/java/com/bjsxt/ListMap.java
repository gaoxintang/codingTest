package com.bjsxt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap {
	public static void main(String[] args) {
//		List<Integer> list1 = new ArrayList<Integer>();
//		list1.add(1);
//		list1.add(3);
//		list1.add(4);
//		list1.add(12);
//		list1.add(18);
//		list1.add(4);
//		listCompar(list1);
//		System.out.println(list1.toString());
//		System.out.println(list1);
//		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		List<String> list1 = new ArrayList<String>();
		list1.add("aadfggdfjhhgj");
		map=getChar("aadfggdfjhhgj");
		System.out.println(map);
	}
	public static Map<Character,Integer> getChar(String parameter) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		List<String> list = new ArrayList<String>();
		for(int i = 97; i <= 122; i++) {
			char temp = (char) i;
			map.put(temp, 0);
			
		}
		for(int i = 0;i < parameter.length();i++) {
			Character tempi = parameter.charAt(i);
			int count = map.get(tempi);
			map.put(tempi, count+1);
		}
		return map;
	}
}
