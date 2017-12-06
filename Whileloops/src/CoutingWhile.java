import java.util.Scanner;

public class CoutingWhile 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Type in message and i'll display it 5 times" );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		
		int n = 0;
		while ( n < 5 )
		{
			System.out.println( (n+1) + ". " + message );
			n++;
		}
	}

}
