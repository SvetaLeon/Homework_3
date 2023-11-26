package ua.hillel.shutko.homework3;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int obstacleLength) {
        int runMax = 500;
        if (obstacleLength <= runMax) {
            super.run(obstacleLength);
        } else {
            System.out.println("A dog can only run " + runMax + " meters");
        }
    }

    @Override
    public void swim(int obstacleLength) {
        int swimMax = 10;
        if (obstacleLength <= swimMax) {
            super.swim(obstacleLength);
        } else {
            System.out.println("A dog cannot swim more than " + swimMax + " meters");
        }
    }
}
