import java.util.Scanner;

public class DumbCaalculator 
{
	public static void main(String[] args) 
	{
		Scanner keyboard =  new Scanner(System.in);
		
		int noone, notwo, nothree;
		
		System.out.println("Type in the first number:");
		noone = keyboard.nextInt();
		
		System.out.println("Type in the second number:");
		notwo = keyboard.nextInt();
		
		System.out.println("Type in the third number:");
		nothree = keyboard.nextInt();
		
		System.out.println("I'm going to find their average, first add them: " + (noone+notwo+nothree) + ". Next, I'm going to divide that by 3: " + ((noone+notwo+nothree)/3) + "." );
		
		keyboard.close();
	}

}
