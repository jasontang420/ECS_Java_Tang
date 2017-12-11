import java.util.Scanner;

public class MethodPass 
{
	public static void main(String[] args)
	{
		
		Scanner k = new Scanner(System.in);
		
		System.out.println( "Pick a Number: " );
		divby3(k.nextInt());
		
	}
	
	public static void divby3(int dank)
	{
		
		if ( dank % 3 == 0 )
		{
			System.out.println( "I like that number" );
		}
		else
		{
			System.out.println( "ew" );
		}
		
	}
	

}
