package com.training.autowire;

import org.springframework.stereotype.Component;

@Component
public class Speaker {
  private String type;
  private int volume;
public Speaker() {
	System.out.println("Speaker created........");
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getVolume() {
	return volume;
}
public void setVolume(int volume) {
	this.volume = volume;
}
@Override
public String toString() {
	return "Speaker [type=" + type + ", volume=" + volume + "]";
}
	
}
