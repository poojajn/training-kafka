
package com.training.observer;
import java.util.ArrayList;
import java.util.List;

public class OnePlus6T implements IObservable {
  private List<IObserver> users;
  private boolean isArrived=true;
  
  
  public OnePlus6T() {
	  users=new ArrayList<>();
  }
  @Override
  public void addUser(IObserver observer) {
	  users.add(observer);
  }
  @Override
  public void removeUser(IObserver observer) {
	  users.remove(observer);
  }
  @Override
  public void notifyObserver() {
	  for(IObserver temp:users) {
		  temp.update();
	  }
  }
  public boolean isArrived() {
	  return isArrived;
  }
  public void setArrived(boolean isArrived) {
	  this.isArrived=isArrived;
	  notifyObserver();
  }
}
