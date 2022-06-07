package lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name, 200, 0);
    }

    @Override
    public void doAction() {
        System.out.printf("Кот %s мяукает.%n", getName());
    }

    public String toString() {
        return "Кот " + getName() + " может пробежать " + getEndurance() + "м., но не умеет плавать.";
    }

    public void doRun(int distance) {
        if (distance <= getEndurance()) {
            System.out.printf("Кот %s бежит дистанцию %dм.%n", getName(), distance);
            setEndurance(getEndurance() - distance);
            System.out.printf("Кот %s может пробежать %dм.%n", getName(), getEndurance());

        } else if (getEndurance() == 0) {
            System.out.printf("Кот %s устал и бежать не может.%n", getName());

        } else {
            System.out.printf("Кот %s бежит дистанцию %dм.%n", getName(), getEndurance());
            setEndurance(0);
            System.out.printf("Кот %s устал и бежать не может.%n", getName());
        }
    }

    @Override
    public void doSwim(int distance) {
        System.out.printf("Кот %s не умеет плавать%n", getName());
    }
}
