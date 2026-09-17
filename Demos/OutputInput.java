// input and output demo with pure Java
import java.util.Scanner;

public class OutputInput
{
	
	public static void main (String[] args)
	{
		int age = 0, age2 = 0;
		System.out.println("\n\n");
		System.out.println("Hello");
		System.out.println("CS");
		System.out.println("World");
		System.out.print("Hello");
		System.out.print("CS");
		System.out.println("World");
		Scanner input = new Scanner(System.in);
		System.out.print("Input your name ");
		String name = input.nextLine(); // for Strings
		do {
			System.out.print("Input your age twice for verification purposes: ");
			age = input.nextInt();	// for integers
			age2= input.nextInt();
		} while(age != age2);
		System.out.print("Hello, ");
		System.out.println(name);
		System.out.print("So you are ");
		System.out.print(age);
		System.out.println(" years old?");
		System.out.print("You are ");
		if(age < 18)
		{	System.out.print("a minor");
		} else {
			System.out.print("an adult");
		}
		System.out.println(", then.");
		System.out.println("Bye!");
		System.out.println(input.nextLine());
	}
}

