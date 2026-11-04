
public class TRWS2 {
	
	public static int mystery(int n) {
		System.out.println(n);
		if (n < 0)
			return 2;
		else
			return mystery(n - 1) + mystery(n - 3);
	}

	public static void doSomething(int n) {
	if (n > 0) {
		  doSomething(n - 1);
		  System.out.print(n);
		  doSomething(n - 1);
		}
	}
	
	public static void main (String[] args) {
		//System.out.println( mystery(3) );
		doSomething(3);
	}
}

// result 12
