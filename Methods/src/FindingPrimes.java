import java.util.Scanner;

public class FindingPrimes 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int end,start;
		
		System.out.println( "Enter end: " );
		end = keyboard.nextInt();
		
		System.out.println( "Enter start: " );
		start = keyboard.nextInt();
		
		System.out.println( "Printing Prime numbers from " + start + " to " + end );
		for(int number = 2; number<=end; number++)
		{
			if(isPrime(number))
			{
				System.out.print(number);
			}
		}
	}
	
	public static boolean isPrime(int number)
	{
		for(int i=2; i<number; i++)
		{
			if(number%i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
