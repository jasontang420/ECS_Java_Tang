package ifelsestatements;

import java.util.Scanner;

public class ALittleQuiz 
{
	public static void main(String[] args) 
	{
		
	Scanner keyboard = new Scanner(System.in);
	
	String A1, A2, A3;
	int score;
	
	System.out.println("Q1) What is 土豆 in English?");
	System.out.println( "1) Memes" );
	System.out.println( "2) Potato" );
	System.out.println( "3) Dank" );
	A1 = keyboard.next();
	score = 0;
	
	if(A1.equals("2"))
	{
		System.out.println( "Wowza u smart boi" );
		score++;
	}
	else
	{
		System.out.println( "You baka do you know basic chinese" );
	}
	
	System.out.println( "Q2) What is 1+1?" );
	System.out.println( "1) 2" );
	System.out.println( "2) 3" );
	System.out.println( "3) 4" );
	A2 = keyboard.next();
	
	if(A2.equals("1"))
	{
		System.out.println( "Wow u can do basic math" );
		score = score + 1;
	}
	else
	{
		System.out.println( "My idiot radar is going off" );
	}
	
	System.out.println( "Q3) Capital city of China?" );
	System.out.println( "1) England" );
	System.out.println( "2) Ur mom *dab*" );
	System.out.println( "3) Beijing" );
	A3 = keyboard.next();
	keyboard.close();
	
	if(A3.equals("3"))
	{
		System.out.println( "Basic Geo" );
		score = score + 1;
	}
	else
	{
		System.out.println( "England is my city" );
	}
	
	System.out.println( "Overall you got " + (score) + "/3 correct!" );
	
	}

}
