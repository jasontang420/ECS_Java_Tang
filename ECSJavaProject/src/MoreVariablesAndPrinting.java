
public class MoreVariablesAndPrinting 
{
	public static void main( String[] args)
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight; 
		
		myName = "Dank Memester";
		myAge = 35;     //not a lie
		myHeight = 69;  //inches
		myWeight = 105; //lbs
		myEyes = "As black as my soul";
		myTeeth = "Dark Yellow";
		myHair = "Brown";
		
		System.out.println( "Let's talk about " + myName + "." );
		System.out.println( "He's " + myHeight + " inches" + "(or " + (myHeight * 2.54) + " cm) tall." );
		System.out.println( "He's " + myWeight + " pounds" + "(or" + (myWeight * 0.454) + " kilos) heavy." );
		System.out.println( "Actually, that's not too heavy." );
		System.out.println( "He's got " + myEyes + " eyes and " + myHair + " hair." );
		System.out.println( "His teeth are usually " + myTeeth +  "depending on the coffee" );
		
		System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight 
				+ " I get " + (myAge + myHeight + myWeight) + "." );
		
		
	}

}
