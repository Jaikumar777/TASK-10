package task10;
public class Calling {
	public static void main(String[] args) {
		// Create instances of each subclass
		BlackTea blackTea = new BlackTea();
		GreenTea greenTea = new GreenTea();
		HerbalTea herbalTea = new HerbalTea();
		// Call the overridden method for each subclass
		blackTea.prepareBasicTea();
		greenTea.prepareBasicTea();
		herbalTea.prepareBasicTea();
	}
}
