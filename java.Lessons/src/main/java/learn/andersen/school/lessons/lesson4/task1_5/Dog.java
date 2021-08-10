package learn.andersen.school.lessons.lesson4.task1_5;

class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;

    void run(int length) {
        if (length >= 0 && length <= MAX_RUN_LENGTH) System.out.println("Пес пробежал: " + length );
        else System.out.println("Пес не может пробежать: " + length);
    }

    void swim(int length) {
        if (length >= 0 && length <= MAX_SWIM_LENGTH) System.out.println("Пес проплыл: " + length);
        else System.out.println("Пес не может проплыть: " + length);
    }
}