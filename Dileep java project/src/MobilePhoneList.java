import java.util.ArrayList;
import java.util.Collections;

public class MobilePhoneList {

	public static void main(String[] args) {
		ArrayList<String> mobilelist =new ArrayList<String>();
		mobilelist.add("Galaxy A32");
		mobilelist.add("Vivo v55");
		mobilelist.add("Redmi Note 10");
		mobilelist.add("Oppo A20");
		mobilelist.add("Google Pixel");
		mobilelist.add("Iphone 13pro max");
		Collections.sort(mobilelist);
		System.out.println(mobilelist);
		Collections.reverse(mobilelist);
		System.out.println(mobilelist);
		mobilelist.remove("Oppo A20");
		System.out.println(mobilelist);
		mobilelist.remove(1);
		System.out.println(mobilelist);
		if(mobilelist.contains("Oppo A20")) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		System.out.println(mobilelist.indexOf("Google Pixel"));
	}

}
