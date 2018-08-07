package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements ICriteria {
	
	private ICriteria firstCriteria;
	private ICriteria secondCriteria;
	public AndCriteria() {}
	public AndCriteria(ICriteria firstCriteria, ICriteria secondCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}
	protected ICriteria getFirstCriteria() {
		return firstCriteria;
	}
	protected void setFirstCriteria(ICriteria firstCriteria) {
		this.firstCriteria = firstCriteria;
	}
	protected ICriteria getSecondCriteria() {
		return secondCriteria;
	}
	protected void setSecondCriteria(ICriteria secondCriteria) {
		this.secondCriteria = secondCriteria;
	}
	@Override
	  public List<Person> meetCriteria(List<Person> persons){
		  List<Person> maleList=new ArrayList<Person>();
		  for(Person temp:persons) {
			  if(temp.getGender().equals("female")) {
				  maleList.add(temp);
			  }
		  }
		return  maleList;
	  }
	
}
