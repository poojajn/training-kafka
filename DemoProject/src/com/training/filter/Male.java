package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Male implements ICriteria {
  @Override
  public List<Person> meetCriteria(List<Person> persons){
	  List<Person> maleList=new ArrayList<Person>();
	  for(Person temp:persons) {
		  if(temp.getGender().equals("male")) {
			  maleList.add(temp);
		  }
	  }
	return  maleList;
  }
}
 class MartialStatus implements ICriteria {

	 
	  @Override
	  public List<Person> meetCriteria(List<Person> persons){
		  
		  List<Person> single=new ArrayList<Person>();
		  List<Person> married=new ArrayList<Person>();
		  for(Person temp:persons) {
			  if(temp.getMartialStatus().equals("married")) {
				  married.add(temp);
				  
				  return  married;
			  }
		  else {
			  single.add(temp);
			  return  single;
		      }
			  
		  }
		return  null;
	    
//         }//end crite
////	  public static List<Person> married(List<Person> persons){
////		  List<Person> married=new ArrayList<Person>();
////		     married.add(persons);
////			 
////		  return  married;
////	  }
     }
 }
 
 