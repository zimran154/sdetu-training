package basics;

public class Cities {

	public static void main(String[] args) {
		//Declare and define array
		String[] cities = {"Dallas", "Boston", "Miami", "Baltimore" };
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);		
		
		//Declare Array
		String[] countries;
		
		//Define array
		countries = new String[4];
		countries[0] = "USA";
		countries[1] = "UAE";
		countries[2] = "Pakistan";
		countries[3] = "UK";
		System.out.println(countries[2]);

		//Declare and define the array (only size)

		String[] states = new String [5];
		states[0] = "Texas";
		states[1] = "Idaho";
		states[2] = "Iowa";
		states[3] = "Ohio";
		states[4] = "Utah";
		int i = 0;
				
		// do loops: enter the loop then condition
		do {
			System.out.println("States: " + states[i]);
			i = i + 1;
		
		} while (i < 5);
		
		//While loop: test condition first then enters loop
		int n = 0;
		boolean statefound = false;
		while (!statefound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("State found!");
				statefound = true;
				
			}
			n ++;
			
		}
		System.out.println("/nPrinting with FOR LOOPS");
		//For loops: best structure for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
		
	}	
}
