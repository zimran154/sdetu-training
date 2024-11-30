package basics;

public class Weather {
	public static void main(String[] args) {
		// This program will give suggestion of what to wear based on weather (Temperature)
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("it's pleasent. Wear shorts and t-shirts.");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")){
			System.out.println("It's a bit cold. Perhaps wear long-sleeve shirt and jeans.");
			System.out.println("Wear a hat to keep the sun out of your eyes.");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day, make sure to wear warmer clothes.");
		}
		else {
			System.out.println("Look like a cold day. Bring a sweater.");
		}
		System.out.println("The program is ending");
	}
}
