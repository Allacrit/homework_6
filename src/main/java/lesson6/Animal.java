package lesson6;

public abstract class Animal {

    private String name;
    private int endurance;
    private int distanceSwimming;

    public Animal(String name, int endurance, int distanceSwimming) {
        this.name = name;
        this.endurance = endurance;
        this.distanceSwimming = distanceSwimming;
    }

    public abstract void doAction();


    public void printInfo() {
        System.out.println(this);
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public abstract String toString();

    public abstract void doRun(int distance);

    public abstract void doSwim(int distance);

    public String getName() {
        return name;
    }

    public int getDistanceSwimming() {
        return distanceSwimming;
    }

    public void setDistanceSwimming(int distanceSwimming) {
        this.distanceSwimming = distanceSwimming;
    }
}
