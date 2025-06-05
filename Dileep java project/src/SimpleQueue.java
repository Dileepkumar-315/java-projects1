import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {

	public static void main(String[] args) {
	Queue<String> studentlist = new LinkedList<String>();
	
	studentlist.add("Student 1");
	studentlist.add("Student 2");
	studentlist.add("Student 3");
	
	System.out.println(studentlist);
	
	String FirstOut = studentlist.poll();
	System.out.println(FirstOut);
	System.out.println(studentlist);
	}

}
