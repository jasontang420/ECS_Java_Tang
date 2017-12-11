
public class EvennesMethod 
{
	public static void main(String[] args) 
	{
		for ( int i = 1; i <= 100; i++ )
		{
			if( i % 3 == 0  )
			{
				isDivBy3();
			}
			if ( i % 5 == 0 )
			{
				System.out.print("Buzz");
			}
			else 
			{
				System.out.println("\n" + i );
			}
		}		
	}
	
	public static void isEven()
	{
		System.out.print( "<" );
	}
	
	public static void isDivBy3()
	{
		System.out.print( "=" );
	}

}
