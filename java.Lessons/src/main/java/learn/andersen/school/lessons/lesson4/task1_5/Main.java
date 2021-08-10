package learn.andersen.school.lessons.lesson4.task1_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Ваниль", 0);
        cat.run(201);
        cat.swim(1);

        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);

        Cat[] pets = {
                new Cat("Васька", 3),
                new Cat("Томас", 4),
                new Cat("Гретта", 5),
                new Cat("Мурка", 2),
                new Cat("Савелий", 2),
                new Cat("Персик", 8),
                new Cat("Лео", 9),
                new Cat("Лили", 1)
        };

        System.out.println("Укажите первоначальное количество еды в миске:");
        Plate plate = new Plate(new Scanner(System.in).nextInt());

        for (Cat c : pets) {
            while (!c.isFullness() && plate.getFood() >= c.getAppetite()) {
                c.eat(plate);
                plate.info();
            }

        }
        for (Cat c : pets) {
            if (c.isFullness()) System.out.printf("%s наелся\n", c.getName());
            else System.out.printf("%s остался голодным, ему не хватило %d единиц еды\n", c.getName(), c.getCatFullness() - c.getSaturationFood());
        }

    }
}
