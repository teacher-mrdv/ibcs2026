
public class TRW2 {
	public static void strRecur(String s) {
		if (s.length() < 6) {
			  System.out.println(s);
			  strRecur(s + "*");
		}
	}

	public static void printString(String s) {
	   if (s.length() > 0)
	   {	System.out.println(s);
			printString(s.substring(1)); // removes first character from string
			System.out.print(s.substring(0, 1)); // prints first character from string
	   }
	}

	public static void main (String[] args) {
		System.out.println("strRecur(\"hi\");");
		strRecur("hi");
		System.out.println("printString(\"acer\");");
		printString("acer");
	}
}

