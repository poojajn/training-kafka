package com.training.observer;

public class User implements IObserver{
	private IObservable observable=null;
	private String name;
	protected IObservable getObservable() {
		return observable;
	}
	protected void setObservable(IObservable observable) {
		this.observable = observable;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	public User(IObservable observable, String name) {
		super();
		this.observable = observable;
		this.name = name;
	}
	public void buyMobile() {
		
		
		System.out.println("Hurry I'hv bought OnePlus6T,by "+name);
	}
public void buyMobile1(IObservable observable, String name) {
		
		
		
		System.out.println("object::::");
		if(observable.getClass().getName().contains("OnePlus6T")) {
		System.out.println("Hurry I'hv bought OnePlus6T,by "+name);
	}else if(observable.getClass().getName().contains("Apple"))
		{System.out.println("Hurry I'hv bought Apple,by "+name);}
	else System.out.println("no User available:::::");
}
  @Override
  public void update() {
	  buyMobile1(observable,name);
	  
  }
  public void unSubscribe() {
	  observable.removeUser(this);
  }
}
