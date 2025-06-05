import java.util.Scanner;

public class PalindromeTask {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Input:");
		 String n = sc.nextLine();
		 StringBuilder sb = new StringBuilder(n);
		 String reverse = sb.reverse().toString();
		 
		 if(n.equals(reverse)){
			 System.out.println("It is an palindrome.");
		 }
		 else {
			 System.out.println("It is not an Palindrome.");
			 
		 }
		 

	}

}
