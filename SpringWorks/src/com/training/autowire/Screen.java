package com.training.autowire;

import org.springframework.stereotype.Component;

@Component
public class Screen {
   private String glsType;
   private int leg;
   private int bre;
   
   
public Screen() {
	System.out.println("screan created..........");
}
public String getGlsType() {
	return glsType;
}
public void setGlsType(String glsType) {
	this.glsType = glsType;
}
public int getLeg() {
	return leg;
}
public void setLeg(int leg) {
	this.leg = leg;
}
public int getBre() {
	return bre;
}
public void setBre(int bre) {
	this.bre = bre;
}
@Override
public String toString() {
	return "Screen [glsType=" + glsType + ", leg=" + leg + ", bre=" + bre + "]";
} 
}
