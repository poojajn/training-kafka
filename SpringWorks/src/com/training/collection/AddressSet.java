package com.training.collection;

import java.util.Set;

public class AddressSet {

	
	private Set<String> address;

	@Override
	public String toString() {
		return "AddressSet [address=" + address + "]";
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}
}
