package basics;

public class FactorialsApp {

	public static void main(String[] args) {
		int num = 5;
		System.out.println("Factorial of " + num + " is " + factorial(num));
		
	}
	public static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
		
	}

}
