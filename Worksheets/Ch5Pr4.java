/* Chapter 5, problem #4 [5.4]
 * The sequence above is a much quicker way of calculating pi
 * Write a program that will add up the sequence above to 100 terms.
 * Output double the answer (3.1415926535897922)
 */
import java.util.*;

public class Ch5Pr4
{
	public static void main(String args[])
	{
		double sum = 0;
		double a = 1;
		double b = 1;
		double x = 1;
		double term = 0;

		for (int i = 1; i <= 100; i++)
		{
			term = a/b;
			sum = sum + term;

			x = x + 2;
			a = a * i;
			b = b * x;			

			System.out.println ( a + " / " + b + "\t" + x );
			
		}
		System.out.println( "Pi is " + (sum * 2) );

	}
}
// Pi is 3.1415926535897922
