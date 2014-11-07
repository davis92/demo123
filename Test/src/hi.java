import java.util.Scanner;

public class hi 
{
	public static void main(String [] args)
	{	
		//commenting this out to see if it works
		Scanner keyboard = new Scanner(System.in);
		String name, gender;
		double age, kindness, attractiveness, gpa;
		boolean pass;
		
		System.out.println("What is your name?");
		name = keyboard.next();
		
		System.out.println("Hi " + name + ", are you a female? Answer \"yes\" or \"no\"");
		gender = keyboard.next();
		
		System.out.println(name + ", how old are you?");
		age = keyboard.nextDouble();
		
		System.out.println(name + ", on a scale between 1 and 10 how nice do you think you are to others?");
		kindness = keyboard.nextDouble();
		
		System.out.println(name + ", on a scale between 1 and 10, how attractive are you?");
		attractiveness = keyboard.nextDouble();
		
		System.out.println(name + ", what is your GPA?");
		gpa = keyboard.nextDouble();
		
		pass = (gender.equals("yes")  && age >18 && age < 28 && kindness > 7 && attractiveness > 7 && gpa > 2.9);
		
		System.out.println("Davis might date me: " + pass);
	}
		
	}

