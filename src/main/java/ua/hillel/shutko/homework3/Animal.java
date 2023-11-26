package ua.hillel.shutko.homework3;

public class Animal {
    private final String name;
    public static int COUNTER_ANIMAL = 0;

    public Animal(String name) {
        this.name = name;
        COUNTER_ANIMAL++;
    }

    public void run(int obstacleLength) {
        System.out.println(name + " run " + obstacleLength + " meters");
    }

    public void swim(int obstacleLength) {
        System.out.println(name + " swim " + obstacleLength + " meters");
    }
}
