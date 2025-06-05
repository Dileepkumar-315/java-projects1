import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> studentlist = new LinkedHashMap<Integer,String>();
		studentlist.put(101, "siri");
		studentlist.put(102, "bunny");
		studentlist.put(103, "nani");
		studentlist.put(104, "hari");
		studentlist.put(105, "giri");	
		
		System.out.println(studentlist);

	}

}
