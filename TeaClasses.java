package task10;
public class TeaClasses {
   // Method to prepare basic tea
   public void prepareBasicTea() {
       System.out.println("Prepare basic tea with hot water and tea leaves.");
   }
}
class BlackTea extends TeaClasses {
   // Override method to prepare black tea
   @Override
   public void prepareBasicTea() {
       System.out.println("Prepare black tea with hot water and black tea leaves.");
   }
}
class GreenTea extends TeaClasses {
   // Override method to prepare green tea
   @Override
   public void prepareBasicTea() {
       System.out.println("Prepare green tea with hot water and green tea leaves.");
   }
}
class HerbalTea extends TeaClasses {
   // Override method to prepare herbal tea
   @Override
   public void prepareBasicTea() {
       System.out.println("Prepare herbal tea with hot water and herbal tea leaves.");
   }
}