
package com.training.observer;
public interface IObservable {

     public void addUser(IObserver observer);
     public void removeUser(IObserver observer);
     public void notifyObserver();
}
