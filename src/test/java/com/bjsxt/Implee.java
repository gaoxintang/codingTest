package com.bjsxt;

public class Implee {
 private int id;
 private String name;
 private int sal ;
 private Integer bona;
 
 
public Implee(int id, String name, int sal, Integer bona) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
	this.bona = bona;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public Integer getBona() {
	return bona;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setBona(Integer bona) {
	this.bona = bona;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}

}
