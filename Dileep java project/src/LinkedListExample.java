import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> a =new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Names:");
		for(int i= 0;i<=5;i++)
		{
			System.out.println("Enter a name of student " + i +":");
			String name = sc.nextLine();
			a.add(name);
		}
		System.out.println("Student Names are:");
		for(String student:a)
		{
			System.out.println(student);
		}
		sc.close();
		
		}
	}
