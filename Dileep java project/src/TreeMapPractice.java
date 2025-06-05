import java.util.TreeMap;

public class TreeMapPractice {

	public static void main(String[] args) {
		TreeMap<String, Integer> list = new TreeMap<String, Integer>();
		list.put("ele", 100);
		list.put("babi",100);
		list.put("charith",98);

		System.out.println(list.get("ele"));
		System.out.println(list.containsKey("babi"));
		System.out.println(list.containsValue(98));
		
		
	}

}
