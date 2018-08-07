package com.training.collection;

import java.util.List;

public class QuestionBank {
	
	
	private String question;
	   private List<String> options;
	
   @Override
	public String toString() {
		return "QuestionBank [question=" + question + ", options=" + options + "]";
	}

public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<String> getOptions() {
	return options;
}
public void setOptions(List<String> options) {
	this.options = options;
}
   
}
