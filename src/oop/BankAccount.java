package oop;

public class BankAccount implements IRate {
	//Define variables
	String accountNumber;
	
	//static >> belongs to the CLASS not the object instance
	//Final >> constant (often static final)
	
	private static final String routingNumber = "123456";
	
	//Instance variable
	private String name;
	private String ssn;
	String accounttype;
	double balance;
	
	//Constructor definition: unique methods
		//1. They are used to define / setup / initialize properties of an object
		//2. Constructors are IMPLICITY called upon INSTANTIATION
		//3. The same name as the class itself
		//4. Constructors have NO return type
		BankAccount(){
			System.out.println("NEW ACCOUNT CREATED");
		}
		//Overloading: call some method name with different arguments
		BankAccount(String accounttype){
			System.out.println("New Account: " + accounttype);
		}
		BankAccount(String accounttype, double initDeposit){
			System.out.println("New Account: " + accounttype);
			System.out.println("Initial Deposit Of: $" + initDeposit);
			String Msg = null;
			if(initDeposit < 1000) {
				Msg = "ERROR! Minimum deposit must be at least 1000$";
			}else {
				Msg = "Thanks for your initial deposit of: $" + initDeposit;
			}
			System.out.println(Msg);
			balance = balance+initDeposit;
		}
		
		//Getters & Setters
		//Allow the users to define the name
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = "Mr. " + name;
		}
		public String getSsn() {
			return ssn;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		
		public void setRate() {
			System.out.println("Setting Rate");
		}
		
		public void increaseRate() {
			System.out.println("Increasing Rate");
		}
	
		//Define methods
		public void deposit(double amount) {
			balance = balance + amount;
			showActivity("Deposit");
			
		}
		void withdraw(double amount) {
			balance = balance - amount;
			showActivity("Withdraw");
			
		}
		//private can only be called from within the class
		private void showActivity(String activity) {
			System.out.println("Your recent Transaction: " + activity);
			System.out.println("Your new balance is: $" + balance);
			
		}
		void checkBalance() {
			System.out.println("Balance: $" + balance);
			
		}
		void getStatus() {
			
		}
		@Override
		public String toString() {
			return "[ Name: " + name + ". Account: " + accountNumber + ". Routing:" + routingNumber + ". Balance: " + balance + " ]";
		}

}
