package math.model;

/**
 * 
 * @author ftha4681
 *
 */
public class RecursionTool 
{

	public double fibonacciNumber(int position)
	{
		//Bounds Check
		
		if(position <0)
			
		{
			return Integer.MIN_VALUE;
		}
		
		public int factorialNumber(int position)
		//Base Case
		
		if(position == 0)
			
		{
			return 1;
		}
		
		else // RecursiveCase
			
		{
			return position * factorialNumber(position - 1);
		}
	}

	
	public int factorialNumber(int position)
	
	{
		return position*factorialNumber(position - 1);
		
	}
}