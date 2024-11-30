package LABSPRACTICAL;

public class LAB2 {

	public static void main(String[] args) {
		//Create a Student
		Student stu1 = new Student("Janelle", "453769087");
		Student stu2 = new Student("Thomas", "786434356");
		Student stu3 = new Student("Elizabeth", "908785467");
		
		stu1.enroll("Math151");
		stu1.enroll("ENG251");
		stu1.enroll("Hist191");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		
		stu1.payTuition(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
		
	}

}
class Student{
	//properties
	private static int ID=1000;
	private String userID;
	private String name;
	private String SSN;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costofCourse = 800;
	private int balance = 0;
	
	public Student(String name, String SSN) {
		ID++;
		this.name = name;
		this.SSN = SSN;
		setUserId();
		setEmail();
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "." + ID + "@sdetuniversity.edu";
		System.out.println("Your Email: " + email);
	}
	public String getEmail() {
		return email;
	}
	private void setUserId() {
		int min = 1000;
		int max = 9000;
		int randNum = (int)(Math.random()*((max - min)));
		randNum = randNum + min;
		userID = ID + "" + randNum + SSN.substring(5);
		System.out.println("Your User ID: " + userID);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		balance = balance + costofCourse;
	}
	public void payTuition(int amount) {
		System.out.println("Your Payment: $" + amount);
		balance = balance - amount;
		
	}
	public void checkBalance() {
		System.out.println("Your Balance: $" + balance);
	}
	public void showCourses() {
		System.out.println(courses);
	}
	public String toString() {
	return "[Name: " + name + "]\n[Courses: " + courses + "]\n[Balance: $" + balance + "]";	
	}
}

