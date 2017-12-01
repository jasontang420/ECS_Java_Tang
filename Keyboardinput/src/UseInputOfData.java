import java.util.Scanner;

public class UseInputOfData 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String fname, lname, login;
		int grade;
		double id, gpa;
		
		System.out.print("First Name: ");
		fname = keyboard.next();
		
		System.out.print("Last Name: ");
		lname = keyboard.next();
		
		System.out.print("Grade (9-12): ");
		grade = keyboard.nextInt();
		
		System.out.print("Student ID: ");
		id = keyboard.nextDouble();
		
		System.out.print("Login: ");
		login = keyboard.next();
		
		System.out.print("GPA (0.0-5.0): ");
		gpa = keyboard.nextDouble();
		
		System.out.println("Your info: ");
		keyboard.close();
		
		System.out.println("	First Name: " + fname );
		System.out.println("	Last Name: " + lname );
		System.out.println("	Grade (9-12): " + grade );
		System.out.println("	Student ID: " + id);
		System.out.println("	Login: " + login );
		System.out.println("	GPA (0.0-5.0): " + gpa );
		
		
	}

}
