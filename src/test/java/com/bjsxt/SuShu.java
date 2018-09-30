package com.bjsxt;

public class SuShu {
	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {
			int a = i / 100;
			int b = (i - a * 100) / 10;
			int c = (i - a * 100 - b * 10) / 1;

			if (i == (a * a * a + b * b * b + c * c * c)) {
				System.out.println(i);
			}
		}

	}
}
