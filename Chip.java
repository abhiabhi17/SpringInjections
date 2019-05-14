package com.chip;

public class Chip {
private Integer chipid;
private String chipname;
	
public void setChipid(Integer chipid) {
	this.chipid = chipid;
}
public void setChipname(String chipname) {
	this.chipname = chipname;
}
@Override
public String toString() {
	return "Chip [chipid=" + chipid + ", chipname=" + chipname + "]";
}

}
