import java.util.Stack;

public class StackTask {

	public static void main(String[] args) {
    Stack<String> PlateList = new Stack<String>();
    for(int i=1;i<7;i++) {
			System.out.println("Plate " + i + "is cleaned."); 
			PlateList.push("Plate "+ i);
        }
    
		for(int i=1;i<4;i++) {
		System.out.println("Need plate:"+ PlateList.pop());
		System.out.println("No.of plates left"+ PlateList);
		}
		
		if(PlateList.isEmpty()) {
			System.out.println("All plates are completed");
		}
	}

}
