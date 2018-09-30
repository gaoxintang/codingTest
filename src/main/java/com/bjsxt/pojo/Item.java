package com.bjsxt.pojo;

public class Item {
private Integer age;
private String name;
private Integer totalscord;
private Integer banji;
private Integer math;
public Integer getAge() {
	return age;
}
public String getName() {
	return name;
}
public Integer getTotalScord() {
	return totalscord;
}
public Integer getBanji() {
	return banji;
}
public Integer getMath() {
	return math;
}
public Integer getEnglish() {
	return english;
}
public void setAge(Integer age) {
	this.age = age;
}
public void setName(String name) {
	this.name = name;
}
public void setTotalScord(Integer totalscord) {
	this.totalscord = totalscord;
}
public void setBanji(Integer banji) {
	this.banji = banji;
}
public void setMath(Integer math) {
	this.math = math;
}
public void setEnglish(Integer english) {
	this.english = english;
}
private Integer english;
@Override
public String toString() {
	return "Item [age=" + age + ", name=" + name + "]";
}


}
