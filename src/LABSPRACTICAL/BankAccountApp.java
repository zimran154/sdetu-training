package LABSPRACTICAL;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("123456789" , 1000);
		BankAccount acc2 = new BankAccount("213457689" , 2000);
		BankAccount acc3 = new BankAccount("897654123" , 2500);

		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(300);
		acc1.makeDeposit(800);
		acc1.payBill(1000);
		acc2.accrue();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest{
	//Properties of Bank Account
	private static int iD = 1000;					//Internal ID
	private String accountNumber;	//ID + random 2 digit number + First 2 digits of SSN
	private static final String routingNumber = "213456789";
	private String Name;
	private String SSN;
	private double balance;
	
	//Constructors
	public BankAccount(String SSN , double initdeposit) {
		balance = initdeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
		}
	private void setAccountNumber() {
		int random = (int) Math.random() * 100;
		accountNumber = iD + "" + random + SSN.substring(0,2);
		System.out.println("Your Account Number is: " + accountNumber);
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getName() {
		return Name;
	}
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making Deposit: " + amount);
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	@Override
	public String toString() {
		return "[Name: " + Name + "]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n[Balance: " + balance + "]";
	}
}
