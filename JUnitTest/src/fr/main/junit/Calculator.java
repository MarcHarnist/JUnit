package fr.main.junit;

public class Calculator {
	
	// this method will be tested
		public int evaluate(String expression) {
		    int sum = 0;
		    for (String summand: expression.split("\\+"))
		      sum += Integer.valueOf(summand);//HM: Integer.valueOf() cast string to int
		    return sum;
		  }
		
	// this method will be tested. It evaluate an other calculation
	public int evaluateAnOtherCalculation(String expression) {
	    int sum = 0;
	    for (String summand: expression.split("\\+"))
	      sum += Integer.valueOf(summand);//HM: Integer.valueOf() cast string to int
	    return sum;
	  }
	
	
}
