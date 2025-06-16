package day7;
import java.util.*;
public class ArrayListEx{

	public static void main(String[] args) {
		ArrayList<String> students=new ArrayList<String>();
		students.add("Pawan");
		students.add("Kalyan");
		students.add("chandra");
		students.add("babu");
		students.add("Modi");
		System.out.println(students);
		students.remove("babu");
		System.out.println(students);
	}

}
