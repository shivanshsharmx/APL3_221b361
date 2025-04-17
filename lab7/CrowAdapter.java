public class CrowAdapter implements Swan {
    private Crow crow;
    
    public CrowAdapter(Crow crow) {
        this.crow = crow;
    }
    
    @Override
    public void sing() {
        System.out.println("Adapter translates sing to cry");
        crow.cry();
    }
    
    @Override
    public void swim() {
        System.out.println("Adapter translates swim to fly");
        crow.fly();
    }
    
    @Override
    public void eat() {
        System.out.println("Adapter translates eat to eat");
        crow.eat();
    }
}
