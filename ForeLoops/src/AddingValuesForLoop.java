import java.util.Scanner;

public class AddingValuesForLoop 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int x;
		long total = 0; 
		
		System.out.print("Count to: ");
		x = keyboard.nextInt();
		
		for ( int i = 0; i <= x; i++ )
		{
			System.out.print( i + " ");
			total += i;
		}
		
		System.out.println( "\n" + total );
		
	}
	

}
