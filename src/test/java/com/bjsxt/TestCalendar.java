package com.bjsxt;

import org.thymeleaf.util.StringUtils;

public class TestCalendar {
	public static void main(String[] args) {
		
//		TestCalendar tc = new TestCalendar();
		String wareki =getCalendar("1989年07月15日");
		System.out.println(wareki);
		
	}
	
	public static String getCalendar(String input) {
		String result = "";
		if (StringUtils.isEmpty(input)) {
			return "";
		}
		result = getWarekiByShinreki(input.substring(0, 4));
		result = result + input.substring(5);
		return result;
	}
	
	public  static String getWarekiByShinreki(String str) {
		int year = Integer.parseInt(str);
		if (year > 1926 && year <= 1988) {
			int yearWareki = year - 1925;
			return "昭和" + yearWareki + "年";
		} else if (year > 1988) {
			int yearWareki = year - 1988;
			return "平成" + yearWareki + "年";
		} else{
			return "";
		}
	}
	
}
