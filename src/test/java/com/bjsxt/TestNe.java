package com.bjsxt;

import com.alibaba.druid.sql.visitor.functions.Substring;
import com.alibaba.druid.util.StringUtils;

public class TestNe {
	public static void main(String[] args) {
		String ne =getCalendar("平成11年7月15日");
		System.out.println(ne);
	}
	public static String getCalendar(String sr) {
		if(StringUtils.isEmpty(sr)) {
			return "";
		}
		int indexOfYear = sr.indexOf("年");
		String yearName = sr.substring(0, 2);
		
		String year = sr.substring(2, indexOfYear);
		int yearIntValue = Integer.parseInt(year);
		int resultTemp =getWarekiByShinreki(yearName,yearIntValue);
		String result = resultTemp + sr.substring(indexOfYear);
		return result;
		
	}
	public static int getWarekiByShinreki(String b,int c) {
		int r =0;
		if("平成".equals(b)) {
			 r = 1988+c;
			 return r;
			 
		}
		else if("昭和".equals(b)) {
			 r = 1925+c;
			 return r;
		}
		else{return 0;}
	}
}
