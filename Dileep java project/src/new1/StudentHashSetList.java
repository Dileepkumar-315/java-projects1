package new1;
import java.util.HashSet;
import java.util.Scanner;

public class StudentHashSetList {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 students names:");
		while(s.size() < 5) {
			System.out.println("Enter a name of student");
			String name = sc.nextLine();
			if(!s.add(name)) {
				System.out.println("Name already added! Please enter a different name.");
			}
		}
		System.out.println("\nUnique Student Names are:");
		for(String student:s)
		{
			System.out.println(student);
		}
		sc.close();
	}

}
