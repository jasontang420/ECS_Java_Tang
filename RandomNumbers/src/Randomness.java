import java.util.Random;
import java.util.Scanner;

public class Randomness 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		
		System.out.println( "My random number is " + x );
		
		System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.println( 1 + r.nextInt(5) + " ");
		System.out.println( 1 + r.nextInt(5) + " ");
		System.out.println( 1 + r.nextInt(5) + " ");
		System.out.println( 1 + r.nextInt(5) + " ");
		System.out.println( 1 + r.nextInt(5) + " ");
		System.out.println( 1 + r.nextInt(5) + " ");
		System.out.println();
		
		System.out.println( "Here are some numbers from 1 to 100!" );
		System.out.println( 1 + r.nextInt(100) + "\t" );
		System.out.println( 1 + r.nextInt(100) + "\t" );
		System.out.println( 1 + r.nextInt(100) + "\t" );
		System.out.println();
		
		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);
		
		if ( num1 == num2 )
		{
			System.out.println( "The random numbers were the same! Weird." );
		}
		if ( num1 != num2 )
		{
			System.out.println( "Wowza they're different! That's not too surprising" );
		}
	}

}
