package com.training.abstractfactory;

public class EmployeeController {
   private Employee model;
   private StarView starView;
   private DashView dashView;
   

public EmployeeController(Employee model, StarView starView) {
	super();
	this.model = model;
	this.starView = starView;
}
public Employee getModel() {
	return model;
}
public void setModel(Employee model) {
	this.model = model;
}
public StarView getStarView() {
	return starView;
}
public void setStarView(StarView starView) {
	this.starView = starView;
}
public DashView getDashView() {
	return dashView;
}
public void setDashView(DashView dashView) {
	this.dashView = dashView;
}
public void updateView(String viewType) {
	System.out.println("showing::::"+viewType+" view");
	starView.pringEmployee(model);
}
}
