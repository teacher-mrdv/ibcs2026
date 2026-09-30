/*
 * Write a program that displays the first 100 terms of the triangular sequence. This is the sequence that goes 1,3,6,10,15,21, ... The rule is that you add on 2, then add on 3, then add on 4, etc.
 * 
 */


public class Ch1Pr4 {
	
	public static void main (String[] args) {
		int triangular = 0;
		for(int i = 1; i <= 100; i++) {
			triangular = triangular + i;
			System.out.print(triangular + " ");
		}
	}
}

