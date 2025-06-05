import java.util.Scanner;

public class RainUmbrella {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Is It Raining(yes/no):");
		String s=sc.nextLine();
		sc.close();
		if(s.equals("yes")) {
			System.out.println("Take an Umbrella");
		}
		else {
			System.out.println("No need of an Umbrella");
		}

	}

}
