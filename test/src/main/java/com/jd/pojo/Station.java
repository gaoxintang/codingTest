package com.jd.pojo;



public class Station {
	
	private String id;
	
	private String name;
	
	private String symbol;

	public Station(String name, String symbol) {
		super();
		this.name = name;
		this.symbol = symbol;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	

}
