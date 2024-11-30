package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci Numbers is defined by the sum of the previous two fibonnaci numbers
		//fib(0) = 0
		//fib(1) = 1
		//fib(2) = fib(0) + fib(1) = 0 + 1 = 1
		//fib(3) = fib(1) + fib(2) = 1 + 1 = 2
		//fib(4) = fib(3) + fib(2) = 1 + 2 = 3
		//fib(5) = fib(4) + fib(3) = 3 + 2 = 5
		System.out.print(fib(3));

	}
	public static int fib(int n) {
		if (n == 0) {
			return 0;
			
		} else if (n == 1) {
			return 1;
				
		}
		return ( ( ( fib(n-1) ) + ( fib(n-2) ) ) );
	}

}
