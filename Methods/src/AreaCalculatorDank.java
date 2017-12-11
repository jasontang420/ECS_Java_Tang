import java.util.Scanner;

public class AreaCalculatorDank 
{
	public static void main(String[] args) 
	{
		Scanner k = new Scanner(System.in);
		int ans;
		
		System.out.println( "Choose a shape: " );
		System.out.println( "1. Tri   2. Cir" );
		System.out.println( "3. Rec   4. Sqr" );
		ans = k.nextInt();
		
		if ( ans == 1 )
		{
			tri();
		}
		
		if ( ans == 2 )
		{
			cir();
		}
	
		if ( ans == 3 )
		{
			rec();
		}
		
		if ( ans == 4 )
		{
			sqr();
		}
	}
		
	public static void tri()
	{
		Scanner k = new Scanner(System.in);
		
		double height, base;
			
		System.out.println( "Please input Height: " );
		height = k.nextDouble();
		
		System.out.println( "Please input Base " );
		base = k.nextDouble();
		
		System.out.println( "The area of ur tri is " + ((base * height)/2) );
	}
	
	public static void cir()
	{
		Scanner k = new Scanner(System.in);
		
		double radius;
			
		System.out.println( "Please input Radius: " );
		radius = k.nextDouble();
		
		System.out.println( "The area of ur cir is " + (Math.PI * (radius * radius) ) );
		
	}
	
	public static void rec()
	{
		Scanner k = new Scanner(System.in);
		
		double height, base;
			
		System.out.println( "Please input Height: " );
		height = k.nextDouble();
		
		System.out.println( "Please input Base " );
		base = k.nextDouble();
		
		System.out.println( "The area of ur rec is " + (base * height) );
	}
	
	public static void sqr()
	{
		Scanner k = new Scanner(System.in);
		
		double side;
			
		System.out.println( "Please input Side: " );
		side = k.nextDouble();
		
		
		System.out.println( "The area of ur tri is " + (side * side) );
	}
	

}
