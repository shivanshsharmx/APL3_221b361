// Child class Coffee
class Coffee extends Offering {
    @Override
    int getPrice() {
        return 30;
    }

    @Override
    String getName() {
        return "Coffee";
    }
}