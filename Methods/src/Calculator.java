import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		double firstNum, secondNum;
		String operator;
		
		System.out.println( "Type in the First Number: " );
		firstNum = input.nextDouble();
		
		System.out.println( "Type in the second Number: " );
		secondNum = input.nextDouble();
		
		System.out.println( "Type in the Operator: " );
		operator = input.next();
		
		if ( operator.equals("+") )
		{
			plus(secondNum, secondNum);
		}
		
		if ( operator.equals("*") )
		{
			times(secondNum, secondNum); 
		}
		
		if ( operator.equals("%") )
		{
			divide(secondNum, secondNum);
		}
		
		if ( operator.equals("^") )
		{
			power(secondNum, secondNum);
		}
		
		if ( operator.equals("-") )
		{
			subtract(secondNum, secondNum);
		}
	}
	

	public static void plus(double firstNum, double secondNum)
	{
		System.out.println(firstNum+secondNum);
		
	}
	
	public static void times(double firstNum, double secondNum)
	{
		System.out.println(firstNum*secondNum);
	}
	
	public static void divide(double firstNum, double secondNum)
	{
		System.out.println(firstNum%secondNum);
	}
	
	public static void power(double firstNum, double secondNum)
	{
		System.out.println( Math.pow(firstNum, secondNum));
	}
	
	public static void subtract(double firstNum, double secondNum)
	{
		System.out.println(firstNum-secondNum);
	}
}

