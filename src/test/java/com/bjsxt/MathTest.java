package com.bjsxt;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Maps;

public class MathTest {
	public static void main(String[] args) {
		getChar("abbcd");
	}
	public static void getChar(String args) {
		args = args.toUpperCase();
		Map<Character, Integer> result = Maps.newHashMap();
		for(int i=65;i <= 90;i++) {
			char temp = (char) i;
			result.put(temp,0);
		}
		for(int i = 0;i<args.length();i++) {
			char temp = args.charAt(i);
			int count = result.get(temp);
			result.put(temp, count+1);
//			HashMap<> map1 = new Hashmap<>
//			if(((Object) result).getValue()!=0) {
//				
//			}
		}
		System.out.println(result);
	}
	
}
