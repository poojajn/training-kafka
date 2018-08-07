package com.traing.facade;

public class FacadeCar {
    private HatchBack hbc;
    private Sedan sedan;
    private SUV suv;
    public FacadeCar() {
    	this.sedan=new Sedan();
    	this.hbc=new HatchBack();
    	this.suv=new SUV();
    }
    public void hatchBackDriver() {
    hbc.driver();
    }
    public void sedanDriver() {
    	sedan.driver();
        }
    public void suvDriver() {
    	suv.driver();
        }
    }

