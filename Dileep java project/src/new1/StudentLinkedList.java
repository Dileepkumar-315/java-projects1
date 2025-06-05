package new1;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentLinkedList {

	public static void main(String[] args) {
	LinkedList<String> s = new LinkedList<String>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 5 students names:");
	for(int i= 0;i<=5;i++)
	{
		System.out.println("Enter a name of student " + i +":");
		String name = sc.nextLine();
		s.add(name);
	}
	System.out.println("Student Names are:");
	for(String student:s)
	{
		System.out.println(student);
	}
	sc.close();
	

	}

}
