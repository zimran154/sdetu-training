package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//Let's create a variable to define our career
		
		//Declare a variable 
		String career;
		System.out.println("Progress is starting");
		
		//Define variable
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		//Declare & Define
		int hoursperweek = 40;
		int weeksperyear = 50;
		double rate = 42.50;
		
		double salary = hoursperweek * weeksperyear * rate;
		System.out.println("My career as a "+ career +" at the rate of $"+ rate +" per hour is "+ salary +" per year");
		
		//Computer our annual salary
		//rate * hoursperweek * weeksperyear
		
	}
}
