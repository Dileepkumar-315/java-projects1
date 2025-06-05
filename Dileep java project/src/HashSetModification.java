import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetModification {

	public static void main(String[] args) {
		HashSet<String> mobilelist =new HashSet<String>();
		mobilelist.add("Galaxy A32");
		mobilelist.add("Vivo v55");
		mobilelist.add("Redmi Note 10");
		mobilelist.add("Oppo A20");
		mobilelist.add("Google Pixel");
		mobilelist.add("Iphone 13pro max");
		mobilelist.add("Iphone 13pro max");
		System.out.println(mobilelist);
		ArrayList<String> mobilelist1 =new ArrayList<String>(mobilelist);
		System.out.println(mobilelist1);
		if(mobilelist.contains("Vivo v55")) {
			System.out.println("The Element Exists");
		}
		else {
			System.out.println("The Element doesn't Exists");
		}
		Iterator<String> it = mobilelist.iterator();
		
		while(it.hasNext()) {
			String phone = it.next();
			System.out.println(phone);
		}
	}

}
