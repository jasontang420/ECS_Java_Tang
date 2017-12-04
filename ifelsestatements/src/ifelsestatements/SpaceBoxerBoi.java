package ifelsestatements;

import java.util.Scanner;

public class SpaceBoxerBoi 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		double weight;
		String planet;
		
		System.out.print( "Please enter your current earth weight: " );
		weight = keyboard.nextDouble();
		
		System.out.println( "I hvae info for the following planets: " );
		System.out.println( "1. Venus    2. Mars    3. Jupiter" );
		System.out.println( "4. Saturn   5. Uranus  4. Neptune" );
		
		System.out.print( "Which planet are you visiting? " );
		planet = keyboard.next();
		keyboard.close();
		
		if(planet.equals("Venus"))
		{
			System.out.println( "Your weight would be: " + (weight*0.78) );
		}
		
		if(planet.equals("Mars"))
		{
			System.out.println("Your Weight would be: " + (weight*0.39));
		}
		
		if(planet.equals("Jupiter"))
		{
			System.out.println( "Your Weight would be: " + (weight*2.65));
		}
		
		if(planet.equals("Saturn"))
		{
			System.out.println( "Your weight would be: " + (weight*1.17) );
		}
		
		if(planet.equals("Uranus"))
		{
			System.out.println( "Your weight would be: " + (weight*1.05) );
		}
		
		if(planet.equals("Neptune"))
		{
			System.out.println( "your weight would be: " + (weight*1.23) );
		}

		
		
		
	}

}
