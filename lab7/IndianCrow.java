public class IndianCrow implements Crow {
    @Override
    public void cry() {
        System.out.println("Crow is crying");
    }
    
    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }
    
    @Override
    public void eat() {
        System.out.println("Crow is eating");
    }
}