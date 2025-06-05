import java.util.LinkedList;
import java.util.Queue;

public class QueueTask {

	public static void main(String[] args) {
		Queue<String> kidlist = new LinkedList<String>();
		
		for(int i =1;i<4;i++) {
			kidlist.add("Kid" + i);
			System.out.println("Kid " + i + "added to the Queue.");

		}
		
		for(int i =1;i<4;i++) {
			kidlist.poll();
			System.out.println("Kid " + i + "took the icecream.");
		}
		
		if(kidlist.isEmpty()) {
			System.out.println("All kids in the Queue got the icecream and the Queue is Empty.");
		}

	}

}
