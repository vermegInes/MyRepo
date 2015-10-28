package edu.esprit.calculator;

public class Calculator {

	
	public Long add(Long... args){
		 
		Long result=0l;
		for (Long arg: args){
			result+=arg;
		}
		return result;
	}
}
