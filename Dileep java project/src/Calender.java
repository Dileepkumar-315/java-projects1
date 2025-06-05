import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Day:");
		String Day = sc.nextLine();
		sc.close();
		switch(Day) {
		case "Monday":
			System.out.println("Lets Learn Python");
			break;
		case "Tuesday":
			System.out.println("Lets Learn Java");
			break;
		case "Wednesday":
			System.out.println("Lets Learn Ruby");
			break;
		case "Thursday":
			System.out.println("Lets Learn Scala");
			break;
		case "Friday":
			System.out.println("Lets Learn C++");
			break;
		case "Saturday":
			System.out.println("Lets Learn Angular JS");
			break;
		case "Sunday":
			System.out.println("Lets Learn AI");
			break;
		default:
	        System.out.println("Not a correct Day");
	        break;
		}

	}

}
