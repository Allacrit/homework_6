package lesson6;

public class Dog  extends Animal {

    public Dog(String name) {
        super(name, 500, 10);
    }

    @Override
    public void doAction() {
        System.out.printf("Пёс %s лает.%n", getName());
    }

    public String toString() {
        return  "Пёс " + getName() + " может пробежать " + getEndurance() + "м., может проплыть " + getDistanceSwimming() + "м." ;
    }

    public void doRun(int distance) {
        if (distance <= getEndurance()) {
            System.out.printf("Пёс %s бежит дистанцию %dм.%n", getName(), distance);
            setEndurance(getEndurance() - distance);
            System.out.printf("Пёс %s может пробежать %dм.%n", getName(), getEndurance());

        } else if (getEndurance() == 0) {
            System.out.printf("Пёс %s устал и бежать не может.%n", getName());

        } else {
            System.out.printf("Пёс %s бежит дистанцию %dм.%n", getName(), getEndurance());
            setEndurance(0);
            System.out.printf("Пёс %s устал и бежать не может.%n", getName());
        }
    }


    public void doSwim(int distance) {
            if (distance <= getDistanceSwimming()) {
                System.out.printf("Пёс %s плывёт %dм.%n",getName(),distance);
                setDistanceSwimming(getDistanceSwimming() - distance);
                System.out.printf("Пёс %s может проплыть %dм.%n",getName(),getDistanceSwimming());

            } else if (getDistanceSwimming() == 0) {
                System.out.printf("Пёс %s устал и плыть не может%n", getName());

            } else {
                System.out.printf("Пёс %s проплывает %dм.%n",getName(),getDistanceSwimming());
                setDistanceSwimming(0);
                System.out.printf("Пёс %s устал и плыть не может%n",getName());
            }

    }
}
