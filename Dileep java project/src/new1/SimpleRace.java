package new1;
class Car extends Thread{
	public void run() {
		for(int i=1;i<4;i++) {
		System.out.println("BMW Car is moving"+i);
	}
}
}
	class RaceBike extends Thread{
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
public class SimpleRace {

	public static void main(String[] args) {
	new Car().start();
	new RaceBike().start();
	}
}

