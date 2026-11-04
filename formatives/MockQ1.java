import java.util.Scanner;

public class MockQ1 {
	
	public static void main (String[] args) {
		System.out.println("Marcos");
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter a number < 10: ");
			number = input.nextInt();
			if(number < 1 || number >= 10) {
				System.out.println("Error! input again");
			}
		} while(number < 1 || number >= 10);
		for(int i = 1; i <= number; i++) {
			int square = (i*i);
			System.out.print(i);
			if(square < 10) {
				System.out.print(" ");
			}
			System.out.print(" " + (i*i));
			int power = 1;
			for(int j = 0; j < i; j++) {
				power = power * number;
			}
			int countDigits = 0;
			int n = number;
			while(n > 0) {
				n = n / 10;
				countDigits++;
			}
			for(int s = 0; s < 11 countDigits
			System.out.println(power);
		}
	}
}

// largest number = 81387420489 = 11 digits long!
