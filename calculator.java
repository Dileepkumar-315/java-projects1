import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in);
		System.out.println("Enter a frist number:");
		double num1= input.nextDouble();
		System.out.println("Enter a second number:");
		double num2= input.nextDouble();
		System.out.println("choose an opration(+, - , * , / ):");
		char oprators = input.next().charAt(0);
		double result;
		switch(oprators) {
		case '+':
			result= num1+num2;
			System.out.println("result"+result);
		case '-':
			result= num1-num2;
			System.out.println("result"+result);
		case '*':
			result= num1*num2;
			System.out.println("result"+result);
		case '/':
			if(num2 != 0) {
			result= num1/num2;
			System.out.println("result"+result);
			}else {
				System.out.println("error:");
			}break;
	  default:
				System.out.println("invalid oprator");
			}
					input.close();
			
		}
	}

