package com.rocket;

import com.chip.Chip;

public class Rocket {
private Integer rocketid;
private Integer rocketname;
private Chip chip;

public void setRocketid(Integer rocketid) {
	this.rocketid = rocketid;
}

public void setRocketname(Integer rocketname) {
	this.rocketname = rocketname;
}

public void setChip(Chip chip) {
	this.chip = chip;
}

@Override
public String toString() {
	return "Rocket [rocketid=" + rocketid + ", rocketname=" + rocketname + ", chip=" + chip + "]";
}

}
