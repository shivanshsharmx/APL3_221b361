public class Application {
    public static void main(String[] args) {
        // Create a Crow
        Crow crow = new IndianCrow();
        
        // Adapt the Crow to a Swan
        Swan adaptedCrow = new CrowAdapter(crow);
        
        // The Princess interacts with what she thinks is a Swan
        System.out.println("Princess is marrying what she thinks is a Swan:");
        client(adaptedCrow);
    }
    
    public static void client(Swan swan) {
        System.out.println("\nPrincess asks the Swan to sing:");
        swan.sing();
        
        System.out.println("\nPrincess asks the Swan to swim:");
        swan.swim();
        
        System.out.println("\nPrincess asks the Swan to eat:");
        swan.eat();
    }
}