import java.util.Scanner;

public class Ageln5 
{
	public static void main(String[] args) 
	{
		Scanner keyboard =  new Scanner(System.in);
		
		String name; 
		int age;
		
		System.out.println("What's your name?");
		name = keyboard.next();
		
		System.out.println("Hi," + name + " , how old are you? ");
		age = keyboard.nextInt();
		
		System.out.println("Did you know in 5 years you will be " + (age+5) + " years old? And 5 years ago you were " + (age-5) + "!");
		
		keyboard.close();
	}

}
