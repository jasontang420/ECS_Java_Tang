import java.util.Scanner;

public class WhileLoops
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
		
		System.out.println( "WELCOME TO THE BANK OF THE DANK" );
		System.out.println( "ENTER YOUR PIN: " );
		int entry = keyboard.nextInt();
		
		while ( entry != pin )
		{
			System.out.println( "\nWrong u idiot" );
			System.out.println( "Enter your pin:" );
			entry = keyboard.nextInt();
		}
		
		System.out.println( "Pin accepted. U have access now" );
		
	}
	

}
