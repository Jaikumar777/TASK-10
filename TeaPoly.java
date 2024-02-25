package task10;
//Base class Tea
class Tea {
	public void brew() {
		System.out.println("Brewing tea");
	}
}
//Subclass BlackTea
class BlackTea extends Tea {
	@Override
	public void brew() {
		System.out.println("Brewing black tea");
	}
}
//Subclass GreenTea
class GreenTea extends Tea {
	@Override
	public void brew() {
		System.out.println("Brewing green tea");
	}
}
public class TeaPoly {
	public static void main(String[] args) {
		// Create an array of Tea objects
		Tea[] teas = new Tea[3];
		// Populate the array with instances of Tea and its subclasses
		teas[0] = new Tea(); // Tea object
		teas[1] = new BlackTea(); // BlackTea object
		teas[2] = new GreenTea(); // GreenTea object
		// Brew each tea in the array using polymorphism
		for (Tea tea : teas) {
			tea.brew(); // Polymorphic method call
		}
	}
}

