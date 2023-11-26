package ua.hillel.shutko.homework3;

public class Main {
    public static void main(String[] args) {

        Cat catTom = new Cat("Tom");
        catTom.run(100);
        catTom.swim(5);
        System.out.println();

        Dog dogMolly = new Dog("Molly");
        dogMolly.run(300);
        dogMolly.swim(11);
        System.out.println();

        Cat catLoki = new Cat("Loki");
        catLoki.run(250);
        catLoki.swim(3);
        System.out.println();

        Dog dogMax = new Dog("Max");
        dogMax.run(600);
        dogMax.swim(8);
        System.out.println();

        Animal leopardRex = new Animal("Rex");
        leopardRex.run(800);
        leopardRex.swim(20);
        System.out.println();

        System.out.println("Total created " + Animal.COUNTER_ANIMAL + " animals");
    }
}
