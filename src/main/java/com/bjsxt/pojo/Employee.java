package com.bjsxt.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
	private Integer empno ;
	private String ename ;
	private String job ; 
	private String mgr ; 
	private Date hiredate;
	private BigDecimal sal; 
	private BigDecimal comm ;
	private Integer deptno;
	public Integer getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public String getJob() {
		return job;
	}
	public String getMgr() {
		return mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public BigDecimal getSal() {
		return sal;
	}
	public BigDecimal getComm() {
		return comm;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}
	public void setComm(BigDecimal comm) {
		this.comm = comm;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate="
				+ hiredate + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}	

}
