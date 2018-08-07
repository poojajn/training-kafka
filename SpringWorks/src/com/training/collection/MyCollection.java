package com.training.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyCollection {
    private List<String> questionBank;
  private Set<String> addressSet;
   AccountMap accountMap;

public List<String> getQuestionBank() {
	return questionBank;
}

@Autowired @Qualifier("questionBank")
public void setQuestionBank(List<String> questionBank) {
	this.questionBank = questionBank;
}
public Set<String> getAddressSet() {
	return addressSet;
}
@Autowired @Qualifier("addressSet")
public void setAddressSet(Set<String> addressSet) {
	this.addressSet = addressSet;
}
public AccountMap getAccountMap() {
	return accountMap;
}
@Autowired
public void setAccountMap(AccountMap accountMap) {
	this.accountMap = accountMap;
}
@Override
public String toString() {
	return "MyCollection [questionBank=" + questionBank + ", addressSet=" + addressSet + ", accountMap=" + accountMap
			+ "]";
}
   
   
   
  
}
