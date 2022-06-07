package lesson6;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat("Семён");
        Cat cat1 = new Cat("Рыжик");
        Dog dog = new Dog("Жучок");


        cat.printInfo();
        cat1.printInfo();
        dog.printInfo();

        dog.doRun(150);
        dog.doRun(200);
        dog.doRun( 600);
        dog.doRun( 60);


        cat.doRun(300);
        cat.doRun(10);

        cat.doSwim(1);
        dog.doSwim(5);
        dog.doSwim(5);
        dog.doSwim(5);

        cat.doAction();

















    }
}
