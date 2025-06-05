package new1;


class car implements Runnable{
	public void run() {
		for(int i=1;i<4;i++) {
		System.out.println("BMW Car is moving"+i);
		try {
			Thread.sleep(500);
		}
		catch(Exception e){
			
		}
	}
}
}
	class Bike implements Runnable{
		public void run() {
			for(int i=1;i<4;i++) {
			System.out.println("NINJA Bike is moving"+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e){
				
			}
		}
	}
	}
public class SimpleRaceRunnable {

	public static void main(String[] args) {
	Thread caThread = new Thread(new car());
		Thread baThread = new Thread(new Bike());
		System.out.println("Goo");
		caThread.start();
		baThread.start();
	}
}
	

