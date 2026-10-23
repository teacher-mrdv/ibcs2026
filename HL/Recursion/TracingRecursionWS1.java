
public class TracingRecursionWS1 {

	public static int f(int k, int n) {
		System.out.println( "k = " + k + "    n = " + n );
		if (n == k) {
			return k;
		} else {
			if (n > k) {
				return f(k, n - k);
			} else {
				return f(k - n, n);
			}
		}
	}

	public static void main (String[] args) {
			System.out.println( "f(6, 8): " + f(6, 8) );
		}
	}

