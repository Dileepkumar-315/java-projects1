import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

class Arraylist{
	public  Arraylist() {
		ArrayList<String> studentlist = new ArrayList<String>();
		studentlist.add("siri");
		studentlist.add("bunny");
		studentlist.add("nani");
		studentlist.add("hari");
		studentlist.add("giri");	
		
		System.out.println(studentlist);
	}
}

class Linkedlist extends Arraylist{
	public  Linkedlist() {
		LinkedList<String> studentlist = new LinkedList<String>();
		studentlist.add("siri");
		studentlist.add("bunny");
		studentlist.add("nani");
		studentlist.add("hari");
		studentlist.add("giri");
		
		System.out.println(studentlist);
	}
}

class Hashset extends Arraylist{
	public  Hashset() {
		HashSet<String> studentlist = new HashSet<String>();
		studentlist.add("siri");
		studentlist.add("bunny");
		studentlist.add("nani");
		studentlist.add("hari");
		studentlist.add("giri");
		
		System.out.println(studentlist);
	}
}

class Hashmap extends Arraylist{
	public  Hashmap() {
		HashMap<Integer, String> studentlist = new HashMap<Integer,String>();
		studentlist.put(101, "siri");
		studentlist.put(102, "bunny");
		studentlist.put(103, "nani");
		studentlist.put(104, "hari");
		studentlist.put(105, "giri");	
		
		System.out.println(studentlist);
	}
}
public class AllList {

	public static void main(String[] args) {
		Arraylist a = new Arraylist();
		Linkedlist b = new Linkedlist();
		Hashset c = new Hashset();
		Hashmap d = new Hashmap();
	}

}
