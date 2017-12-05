import java.util.Random;
import java.util.Scanner;
	
public class HiLow 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x = 1 + r.nextInt(100);
		
		int ans;
		
		System.out.println( "I'm thinking of a number from 1-100. Guess it u scrub" );
		ans = keyboard.nextInt();
		
		if ( ans > x )
		{
			System.out.println( "Too high, I was thinking of " + x );
		}
		
		if ( ans < x )
		{
			System.out.println( "Too low, I was thinking of " + x );
		}
		
		if ( ans == x )
		{
			System.out.println( "Nice job! You guessed ot!" );
		}
		
	}

}
