package task10;

public class Tea {
	
	public void prepareTea() {
		System.out.println("Prepared a basic tea with hot water and tea leaves");
	}
	public void addMilk() {
		System.out.println("Add Milk to the Tea");
	}
	public void addSugar() {
		System.out.println("Add Sugar to the Tea");
	}
	public static void main(String[] args) {
		// Create an instance of the class
		Tea tea = new Tea();
		// Call the methods
		tea.prepareTea();
		tea.addMilk();
		tea.addSugar();
}
}