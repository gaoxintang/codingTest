package com.bjsxt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HeighTest {
	public static void main(String[] args) {
	 Test0819();
	}
	@SuppressWarnings("unchecked")
	public static void Test0819() {
		ImpleeImpl person = new ImpleeImpl(1,"xiaoming" ,1000, 5300);
		ImpleeImpl person1 = new ImpleeImpl(2,"xiaoli" ,2000, 3300);
		ImpleeImpl person2 = new ImpleeImpl(3,"xiaozhang" ,3000, null);
		ImpleeImpl person3 = new ImpleeImpl(4,"xiaoliu" ,2000, 3300);
		ImpleeImpl person4 = new ImpleeImpl(5,"xiaowang" ,1500, 2300);
		Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
	
		map1.put(5, person4.getBona());
		map1.put(4, person3.getBona());
		map1.put(3, person2.getBona());
		map1.put(2, person1.getBona());
		map1.put(1, person.getBona());
		int value=0;
	     String maxKey = null;
	     List list1=new ArrayList();
	     
	  Iterator<Entry<Integer, Integer>> ite=map1.entrySet().iterator();
	  while(ite.hasNext()){
	           Map.Entry entry =(Map.Entry)ite.next();
	            value = Integer.parseInt(entry.getValue().toString());
	            list1.add(entry.getValue());
	            Collections.sort(list1);
	            
	             if(value == Integer.parseInt(list1.get(list1.size()-1).toString())){
	                maxKey = entry.getKey().toString();
	                System.out.println(maxKey+"/"+value);
	             }
			
		}
		
	}
}
