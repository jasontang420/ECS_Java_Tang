package ifelsestatements;

import java.util.Scanner;

public class HowOldSpecifically 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String name;
		
		System.out.println( "How old are you?" );
		age = keyboard.nextInt();
		
		System.out.println( "Ok , What's your name?" );
		name = keyboard.next();
		
		if( age < 16 )
		{
			System.out.println( "You cannot drive " + name );
		}
		
		if( age >= 16 && age <= 17 )
		{
			System.out.println( "You can drive but not vote " + name );
		}
		
		if(  age >= 18 && age <= 24 )
		{
			System.out.println( "You can vote but not rent a car " + name );
		}
		
		if( age >= 25 )
		{
			System.out.println( "You are a free boi " + name );
		}
	}

}
