import java.util.Stack;

public class burgerStack {

	public static void main(String[] args) {
		Stack<String> BurgerStack = new Stack<String>();
		
		BurgerStack.push("Burger 1");
		BurgerStack.push("Burger 2");
		BurgerStack.push("Burger 3");
		
		System.out.println("Top Burger is "+ BurgerStack.peek());
		
		System.out.println("Serving" + BurgerStack.pop());
		
		if(BurgerStack.isEmpty()) {
			System.out.println("All burgers are served");
		}

	}

}

