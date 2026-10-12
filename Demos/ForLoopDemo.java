
public class ForLoopDemo {
	/*
	 * i++  i = i + 1 
	 * i--	i = i - 1
	 * 
	 */
	public static void main (String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 1; i <= 20; i=i+3) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		int i; // must be declared outstide
		for(i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		int counter = 0;
		while(counter < 10) {
			System.out.print(counter + " ");
			counter++;
		}
		System.out.println();
		counter = 10;
		while(counter > 1) {
			System.out.print(counter + " ");
			counter--;
		}
		
	}
}

