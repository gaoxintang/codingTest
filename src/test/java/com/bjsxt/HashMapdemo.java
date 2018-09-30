package com.bjsxt;

import java.util.HashMap;

public class HashMapdemo {
	public static void main (String[] args) {
		function();
	}
	public static void function() {
		HashMap<String,Person> map = new HashMap<String,Person>();
		map.put("beijing", new Person("qq",20));
		map.put("shanghai", new Person("ww",23));
		map.put("tianjing", new Person("ee",25));
		map.put("dalian", new Person("rr",26));
		map.put("taiwan", new Person("tt",27));
		for(String key:map.keySet()){
			Person value = map.get(key);
			System.out.println(key+"---"+value);
		}
	}
}