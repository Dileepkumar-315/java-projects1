import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_and_Queue_Task {

	public static void main(String[] args) {
		Stack<String> ToyBox= new Stack<String>();
		
		ToyBox.push("Ball");
		ToyBox.push("Blocks");
		ToyBox.push("Puzzle");
		
		System.out.println("The Toy List is: "+ ToyBox);
		System.out.println("The Top Toy " +ToyBox.pop()+ " is removed.");
		System.out.println("Remaining Toy List: " +ToyBox);
		
		
		Queue<String> IcecreamLine = new LinkedList<String>();
		
		IcecreamLine.add("chinni");
		IcecreamLine.add("nani");
		IcecreamLine.add("banti");
		
		System.out.println("Kid Queue: "+ IcecreamLine);
		System.out.println("serving 1st kid: " +IcecreamLine.poll());
		System.out.println("Remaining Queue of kids: " +IcecreamLine);
	}

}
