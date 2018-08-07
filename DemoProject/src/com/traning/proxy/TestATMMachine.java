package com.traning.proxy;

public class TestATMMachine {

	public static void main(String[] args) {
		ATMMachine  atmMachine=new ATMMachine();
		atmMachine.insertCard();
		atmMachine.ejectCard();
		atmMachine.insertCard();
		atmMachine.insertPin(1234);
		atmMachine.requestCash(2000);
		atmMachine.insertCard();
		atmMachine.insertPin(1234);
		
		GetATMData realGetATMData=new ATMMachine();
		GetATMData atmProxy=new ATMProxy();
		System.out.println("\n current ATMState "+atmProxy.getATMData());
		System.out.println("\n Cash in ATMMachine $ "+atmProxy.getCashInMachine());

		//realGetATMData.
		
	}

}
