package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of The Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
			
		}
		String browser = "Chrome";
		//(browser == "chrome")
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		String firstName = "Zain";
		String lastName = "Imran";
		String SSN = "998099008";
		
		System.out.println("There are " + SSN.length() + " numbers in the SSN");
		
		//Print initials plus the last 4 digits of SSN
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0));
		System.out.print(SSN.substring(5));
		
	}

}
