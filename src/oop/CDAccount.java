package oop;

public class CDAccount extends BankAccount implements IRate{
	
	String interestRate;
	
	void Compound() {
	System.out.println("Compounding interest");
	
	}

}
