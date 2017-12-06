import java.util.Scanner;

public class CountingMachineRevisted 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int x;
		
		System.out.print("Count to: ");
		x = keyboard.nextInt();
		
		System.out.println("Count by: ");
		int countby = keyboard.nextInt();
		
		System.out.println("Count From: ");
		int countfrom = keyboard.nextInt();
		
		for ( int i = countfrom; i <= x; i += countby)
		{
			System.out.print( i + " ");
			
		}
		
	}


}
