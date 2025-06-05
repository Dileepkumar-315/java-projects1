package new1;

abstract class Machine {
	abstract void ATM();
	public void ATM2() {
		System.out.println("ATM using JAVA with PHP");
	}
}
class Bank extends Machine{
	void ATM() {
		System.out.println("ATM machine using JAVA");
	}
}
public class AbstractExample{
	public static void main(String[ ] args) {
		Bank b= new Bank();
		b.ATM();
		b.ATM2();

	}

}
