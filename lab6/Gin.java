class Gin extends Decorator {
    Gin(Offering offering) {
        super(offering);
    }

    @Override
    int getPrice() {
        return offering.getPrice() + 20; // Price of Gin addition
    }

    @Override
    String getName() {
        return offering.getName() + " with Gin";
    }
}