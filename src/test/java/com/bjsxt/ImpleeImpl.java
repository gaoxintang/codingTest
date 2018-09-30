package com.bjsxt;

public class ImpleeImpl extends Implee {
	private int totalSal;

	public ImpleeImpl(int id, String name, int sal, Integer bona) {
		super(id, name, sal, bona);
		// TODO Auto-generated constructor stub
		
		this.totalSal = convert(sal,bona);
	}
	private int convert(int sal ,Integer bona) {
		if (bona == null) {
			bona =0 ;
		}
		return bona + sal;
	}
	public int getTotalSal() {
		return totalSal;
	}

}
