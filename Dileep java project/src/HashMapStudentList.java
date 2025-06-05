import java.sql.SQLOutput;
import java.util.HashMap;

public class HashMapStudentList {

	public static void main(String[] args) {
		HashMap<Integer, String> StudentList = new HashMap<Integer, String>();
		StudentList.put(101, "Hari");
		StudentList.put(102, "Giri");
		StudentList.put(103, "Siri");
		StudentList.put(104, "Nani");
		StudentList.put(105, "Sunny");
		StudentList.remove(101);
		StudentList.replace(104,"chinni");
		System.out.println(StudentList);
		
		if(StudentList.containsKey(103)) {
			System.out.println("Key Value Exists");
		}
		else {
			System.out.println("Key Value doesn't Exists");
		}
		
		if(StudentList.containsValue("chinni")) {
			System.out.println("Value Exists");
		}
		else {
			System.out.println("Value doesn't Exists");
		}
		
		
		for(Integer rollno: StudentList.keySet()) {
			System.out.println(rollno);
		}
		
		System.out.println(StudentList.values());
	}

}
