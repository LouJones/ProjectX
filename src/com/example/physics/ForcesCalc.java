package com.example.physics;

public class ForcesCalc {
		private int numOne = 0;
		private int numTwo = 0;
		private int result = 0;

		public ForcesCalc (int numA, int numB){
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
		public int getNumTwo(){
			return numTwo;
		}
		public int forces(){
			result=numOne * numTwo;
			return result;
		}
		}
