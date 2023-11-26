package ua.hillel.shutko.homework3;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int obstacleLength) {
        int runMax = 200;
        if (obstacleLength <= runMax) {
            super.run(obstacleLength);
        } else {
            System.out.println("A cat can only run " + runMax + " meters");
        }
    }

    @Override
    public void swim(int obstacleLength) {
        System.out.println("The cat does not know how to swim");
    }
}
