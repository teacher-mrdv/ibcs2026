/*
 *Write a program that allows you to input the number of steps, the starting point and the increment and then prints out your sequence. So for example step = 4, start = 3, increment = 2. Then the sequence will be 3 5 7 9.
 */
import java.util.Scanner;

public class Ch1Pr12 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of steps, starting point and increment for the sequence: ");
		int steps = input.nextInt();
		int start = input.nextInt();
		int incr  = input.nextInt();
		int sequence = start;
		for(int i = 0; i < steps; i++) {
			System.out.print(sequence + " ");
			sequence = sequence + incr;
		}
			
	}
}

