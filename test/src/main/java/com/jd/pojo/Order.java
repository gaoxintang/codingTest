package com.jd.pojo;
import org.hibernate.validator.constraints.NotBlank;
public class Order {
	
	@org.hibernate.validator.constraints.NotBlank
	private String orderNo;
	
	@NotBlank
	private String stationNo;
	
	@NotBlank
	private String boxNo;
	
	private String updateTime;
	
	private String notUpdate;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getStationNo() {
		return stationNo;
	}

	public void setStationNo(String stationNo) {
		this.stationNo = stationNo;
	}

	public String getBoxNo() {
		return boxNo;
	}

	public void setBoxNo(String boxNo) {
		this.boxNo = boxNo;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getNotUpdate() {
		return notUpdate;
	}

	public void setNotUpdate(String notUpdate) {
		this.notUpdate = notUpdate;
	}
}
