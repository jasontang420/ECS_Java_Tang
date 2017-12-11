import java.util.Scanner;

public class BabyCalc 
{
	public static void main(String[] args) 
	{
		Scanner k = new Scanner(System.in);
		
		System.out.print("Give me a math procedure: ");
		String num1 = k.next();
		String opp = k.next();
		String num2 = k.next();
		System.out.println();
		
		System.out.println(num1);
		System.out.println(opp);
		System.out.println(num2);
		System.out.println();
		
		System.out.println( "You want to (" + opp + "): " + num1 + " and " + num2 + "." );
		
		k.close();
	}

}
