class Voice {
    private Animal[] animals;
    void prepareVoice() {
        animals = new Animal[5]; 
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }
    void hear() {
        for (Animal animal : animals) {
            animal.makeVoice(); 
        }
    }
}
