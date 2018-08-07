
package com.training.observer;

public class Client {

	public static void main(String[] args) {
		IObservable iobservable=new OnePlus6T();
		
		IObserver oneplusUser1=new User(iobservable,"Deepak");
		IObserver oneplusUser2=new User(iobservable,"Krishna");
		
		iobservable.addUser(oneplusUser1);
		iobservable.addUser(oneplusUser2);
		
		IObservable iobservable1=new Apple();
		IObserver userApple1=new User(iobservable1,"kumar");
		IObserver userApple2=new User(iobservable1,"Anuj");
		
		iobservable1.addUser(userApple1);
		iobservable1.addUser(userApple2);
		
		((OnePlus6T)iobservable).setArrived(true);
		((Apple)iobservable1).setArrived(true);
	}

}
