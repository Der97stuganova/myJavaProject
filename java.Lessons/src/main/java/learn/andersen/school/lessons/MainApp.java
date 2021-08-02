package learn.andersen.school.lessons;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(myTask1(4, 8));
        myTask2();
        System.out.println(myTask3(-77));
        myTask4("Happy", 2);
        System.out.println(myTask5(2021));
    }

    public static boolean myTask1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

    public static void myTask2() {
        int a = -100;
        if (a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("число отрицательное");
        }
    }

    public static boolean myTask3(int value) {
        if (value >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void myTask4(String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("[" + i + "]" + " " + word);
        }
    }

    public static boolean myTask5(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }

    }
}

