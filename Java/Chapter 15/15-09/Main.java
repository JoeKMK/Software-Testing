package com.example.species;

public class Main {

    public static void main(String[] args) {
        var dog1 = new Dog("Fido", 54.7, 3);

        var dog2 = new Dog("Rover", 15.2, 2);

        var cat1 = new Cat("Felix", 10.0, false);

        var fish1 = new Fish("Bubbles", 0.1);

        dog1.howToCareFor();
        dog2.howToCareFor();
        cat1.howToCareFor();
        fish1.howToCareFor();

        dog1.about();
        dog2.about();
        cat1.about();
        fish1.about();
    }
}
