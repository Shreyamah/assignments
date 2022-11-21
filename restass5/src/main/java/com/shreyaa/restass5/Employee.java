package com.shreyaa.restass5;

public class Employee {
  private int eid;
  private String ename;
  private String dept;
  private String desg;
  private long sal;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public long getSal() {
	return sal;
}
public void setSal(long sal) {
	this.sal = sal;
}
public Employee(int eid, String ename, String dept, String desg, long sal) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.dept = dept;
	this.desg = desg;
	this.sal = sal;
}
  
  
  
}
