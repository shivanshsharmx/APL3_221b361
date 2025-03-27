// Main class to call abstract class functions
public class Main {
    public static void main(String[] args) {
        Offering coffee = new Coffee();
        Offering tea = new Tea();
        Offering iceCream = new IceCream();

        System.out.println(coffee.getName() + ": " + coffee.getPrice());
        System.out.println(tea.getName() + ": " + tea.getPrice());
        System.out.println(iceCream.getName() + ": " + iceCream.getPrice());

        Offering coffeeWithRum = new Rum(coffee);
        Offering iceCreamWithGin = new Gin(iceCream);

        System.out.println(coffeeWithRum.getName() + ": " + coffeeWithRum.getPrice());
        System.out.println(iceCreamWithGin.getName() + ": " + iceCreamWithGin.getPrice());
    }
}


