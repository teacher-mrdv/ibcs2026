/*

Pr1.1:
Change the program so that you enter in a number and then the program will print your name down the screen that number of times.
  
*/
import java.util.*;

public class Ch1Pr1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("How many times to repeat the name? ");
		int times = input.nextInt();
		for(int i = 0; i < times; i++)
		{
			System.out.println("Marcos");
		}
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

How many times to repeat the name? 9
Marcos
Marcos
Marcos
Marcos
Marcos
Marcos
Marcos
Marcos
Marcos
*/
