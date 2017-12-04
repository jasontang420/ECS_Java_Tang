package ifelsestatements;

import java.util.Scanner;

public class TwoQuestions 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String A1, A2, A3;
		
		System.out.println( "Think of an obj, I will guess" );
		
		System.out.println( "Q1) Is it an animal, veggie, or mineral?" );
		A1 = keyboard.next();
		
		if(A1.equals("animal"))
		{
			System.out.println( "Q2) Is it bigger than a breadbox?" );
			A2 = keyboard.next();
			keyboard.close();
			
			if(A2.equals("no"))
			{
				System.out.println("It's a Squirrel");
			}
			else if(A2.equals("yes"))
			{
				System.out.println("It's a moose");
			}
		}
		
		if(A1.equals("veggie"))
		{
			System.out.println( "Q2) Is it bigger than a breadbox?" );
			A2 = keyboard.next();
			keyboard.close();
			
			if(A2.equals("no"))
			{
				System.out.println("It's a carrot");
			}
			else if(A2.equals("yes"))
			{
				System.out.println("It's a watermelon");
			}
		}
		
		if(A1.equals("mineral"))
		{
			System.out.println( "Q2) Is it bigger than a breadbox?" );
			A2 = keyboard.next();
			keyboard.close();
			
			if(A2.equals("no"))
			{
				System.out.println("It's a paperclip");
			}
			else if(A2.equals("yes"))
			{
				System.out.println("It's camaro");
			}
		}
	}
	
	

}
