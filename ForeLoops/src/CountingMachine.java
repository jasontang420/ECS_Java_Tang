import java.util.Scanner;

public class CountingMachine 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int x;
		
		System.out.print("Count to: ");
		x = keyboard.nextInt();
		
		for ( int i = 0; i <= x; i++ )
		{
			System.out.print( i + " ");
			
		}
		
	}

}
