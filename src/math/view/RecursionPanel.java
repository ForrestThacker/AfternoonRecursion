package math.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import math.controller.RecursionController;


public class RecursionPanel extends JFrame
{
	private RecursionController baseController;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea resultsArea;
	private SpringLayout baseLayout;
	
	public RecursionPanel(RecursionController baseController)
	{
		thisbaseController = baseController;
		fibonacciButton = new JButton("Calculate the Fbonacci number");
		factorialButton = new JButton("n!");
		baseLayout = new JTextField(5);
		resultsArea = new JTextArea(10, 15);
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupListeners()	
	{
		factorialButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = inputField.getText();
				if(checkInput(input))
				{
					resultsArea.setText(baseController.doFactorial(input));
				}
			}
		});
	}
	
	private boolean checkInput(String input)
	{
		boolean isNumber = false;
		
		try
		{
			Integer.parseInt(input);
			isNumber = true;
		}
		catch(Exception numberException)
		{
			resultsArea.setText("You must type in a number");
		}
		
		return isNumber;
	}
}