import java.util.Random;
import java.util.Scanner;

public class HiLowLimited 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x = 1 + r.nextInt(100);
		int tries = 10;
		int ans;
		
		System.out.println( "I'm thinking of a number from 1-100. Guess it u scrub" );
		ans = keyboard.nextInt();
		
		while( ans != x && tries > 0)
		{
			if ( ans > x )
			{
				System.out.println( "Too high");
				System.out.println( "I'm thinking of a number from 1-100. Guess it u scrub" );
				ans = keyboard.nextInt();
				tries--;
			}
			
			if ( ans < x )
			{
				System.out.println( "Too low ");
				System.out.println( "I'm thinking of a number from 1-100. Guess it u scrub" );
				ans = keyboard.nextInt();
				tries--;
			}
			
		}
		if ( ans == x )
		{
			System.out.println( "Nice job! You guessed it!" );
		}
		if ( tries == 0 )
		{
			System.out.println( "U ran out of tries!" );
		}
		
	}

}
