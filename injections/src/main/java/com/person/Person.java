package com.person;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.emp.Employee;


public class Person {
private Integer pid;
private Integer pid1;
private String pname;
private Employee emp;
private List <String> visitedplaces;
private Set<Long> phno;
private Map <String,Long> projectcodes;
private Properties email;
public void setPid(Integer pid) {
	this.pid = pid;
}
public void setPname(String pname) {
	this.pname = pname;
}
public void setEmp(Employee emp) {
	this.emp = emp;
}
public void setVisitedplaces(List<String> visitedplaces) {
	this.visitedplaces = visitedplaces;
}
public void setPhno(Set<Long> phno) {
	this.phno = phno;
}
public void setProjectcodes(Map<String, Long> projectcodes) {
	this.projectcodes = projectcodes;
}
public void setEmail(Properties email) {
	this.email = email;
}
@Override
public String toString() {
	return "Person [pid=" + pid + ", pname=" + pname + ", emp=" + emp + ", visitedplaces=" + visitedplaces + ", phno="
			+ phno + ", projectcodes=" + projectcodes + ", email=" + email + "]";
}

}