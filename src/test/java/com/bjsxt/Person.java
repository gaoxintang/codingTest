package com.bjsxt;

public class Person {
	private String names;
	private int ages;
	public Person(String names, int ages) {
		super();
		this.names = names;
		this.ages = ages;
	}
	public String getNames() {
		return names;
	}
	public int getAges() {
		return ages;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public void setAges(int ages) {
		this.ages = ages;
	}
	@Override
	public String toString() {
		return "Person names--" + names + ", ages=" + ages + " ";
	}
}
