
public class RWS2 {
	
	public static void strRecur(String s) {
	if (s.length() < 6)
	{
	  System.out.println(s);
	  strRecur(s + "*");
		}
	}

	public static void printString(String s) {
	   if (s.length() > 0)
	   {
		  printString(s.substring(1));
		  System.out.print(s.substring(0, 1));
	   }

	}

	
	
	public static void main (String[] args) {
		strRecur("");
		printString("hola");
	}
}

