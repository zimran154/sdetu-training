package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		//Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		// acc1.name = "Roger Hue";
		acc1.accountNumber = "12345678";
		acc1.balance = 3000;
		acc1.setRate();
		acc1.increaseRate();
		
		//With Encapsulation: Public API methods
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("123456789");
		System.out.println(acc1.getSsn());
		
		acc1.deposit (1500);
		/*
		acc1.deposit (1500);
		acc1.deposit (1500);
		acc1.withdraw (2000);
		*/
		
		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "12345678";
		
		BankAccount acc3 = new BankAccount("Saving Account", 1000);
		acc3.accountNumber = "12345678";
		
		/*
		acc3.checkBalance();
		
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		System.out.println(acc3.routingNumber);
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.accounttype = "CD Account";
		cd1.balance = 1000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan nini";
		System.out.println(cd1.toString());
		cd1.Compound();
		*/

	}

}
