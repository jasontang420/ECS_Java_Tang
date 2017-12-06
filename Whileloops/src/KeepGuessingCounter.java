import java.util.Scanner;
import java.util.Random;

public class KeepGuessingCounter 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		int entry, guesses;
		guesses = 0;
		
		
		System.out.println( "I have chosen a number from 1-10. Guess it" );
		System.out.println( "Your Guess:" );
		entry = keyboard.nextInt();
		guesses++;
		
		while( entry != x )
		{
			System.out.println("Wrong! Guess again.");
			System.out.println("Guess again:");
			entry = keyboard.nextInt();
			guesses++;
		}
		
		System.out.println( "\nGood guesser" );
		System.out.println(" It only took you " + guesses + " tries!");
	}


}
