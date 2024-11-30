package basics;

public class NumberCalc {
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 20;
		int numB = 10;
		addNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		System.out.println("The product of the number " + numA + " and number " + numB + " is " + product);
		
	}
	static void printName() {
		System.out.println("My name is Zain Imran.");
		
	}
	static void addNumbers(int numA, int numB) {
		int sum = numA + numB;
		System.out.println("The sum of the number " + numA + " and number " + numB + " is " + sum);
		
	}
	static int multiplyNumbers(int numA, int numB) {
		int product = numA * numB;
		addNumbers(product + 80, product);
		return product;
		
	}

}
