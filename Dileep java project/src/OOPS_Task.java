
public class OOPS_Task {

	private String name;
	private int rollno;
	private int marks;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String CheckResult() {
		if(marks <= 40) {
			return("Fail");
		}
		else {
			return("Pass");
		}
	}
	
	public void displayDetails() {
		System.out.println("Roll no "+getRollno());
		System.out.println("Name "+getName());
		System.out.println("Marks "+getMarks());
		System.out.println("Result "+ CheckResult());
	}
	public static void main(String[] args) {
		OOPS_Task s = new OOPS_Task();
		s.setMarks(100);
		s.setName("Sree");
		s.setRollno(3311);
		
		s.displayDetails();

	}

}
