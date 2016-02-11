package math.controller;

import math.model.RecursionTool;
import math.view.RecursionFrame;

public class RecursionController 
{
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	private String calculatedValue;
	
	public RecursionController()
	{
		mathTool = new RecursionTool();
		baseFrame = new RecursionFrame(this);
		calculatedValue = "";
	}
	
	public void start()
	{
		
	}
 
	public String doFactorial(String input)
	{
		calculatedValue = input + "!"
			Double.toString(mathTool.factorialNumber(Integer.parseInt(input)));
		return calculatedValue;
	}
}
