class Rum extends Decorator {
    Rum(Offering offering) {
        super(offering);
    }

    @Override
    int getPrice() {
        return offering.getPrice() + 15; // Price of Rum addition
    }

    @Override
    String getName() {
        return offering.getName() + " with Rum";
    }
}