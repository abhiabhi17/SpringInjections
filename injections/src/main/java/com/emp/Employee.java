package com.emp;

public class Employee {
private Integer empid;
private String empname;
public void setEmpid(Integer empid) {
	this.empid = empid;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + "]";
}

}
