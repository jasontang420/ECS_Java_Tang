package ifelsestatements;

import java.util.Scanner;

public class BMICalcBetter 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int weight, heightfeet, heightinch;
		double BMI;
		
		System.out.println("How tall are you in feet?");
		heightfeet = keyboard.nextInt();
		
		System.out.println("In inches?");
		heightinch = keyboard.nextInt();
		
		System.out.println("Weight in pounds?");
		weight = keyboard.nextInt();
		keyboard.close();
		
		System.out.println( "Your BMI is " + ((weight*0.4536)/(0.3048*(heightfeet+(heightinch)/12)))*(0.3048*(heightfeet+(heightinch)/12)));
		
	}

}
