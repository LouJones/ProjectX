package com.example.physics;

public class GravityCalc {
	private int numOne = 0;
	private int numTwo = 0;
	private int result = 0;

	public GravityCalc (int numA, int numB){
		setNumOne (numA);
		setNumTwo (numB);
	}
	public void setNumOne (int num1){
		numOne=num1;
	}
	public void setNumTwo (int num2){
		numTwo=num2;
	}
	public int getNumOne(){
		return numOne;
	}
	public int getNumtwo(){
		return numTwo;
	}
	public int gravity(){
		result=numOne * numTwo;
		return result;
	}
	}

