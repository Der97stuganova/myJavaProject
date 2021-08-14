package learn.andersen.school.lessons.lesson6;

public class Main {
public static void main(String[] args) {

        String[][] correctMatrix = {
        {"1", "1", "2", "2"},
        {"3", "3", "4", "4"},
        {"5", "5", "6", "6"},
        {"7", "7", "0", "0"}
        };

        String[][] wrongSizeMatrix = {
        {"1", "1", "2", "2"},
        {"3", "3", "4", "4"},
        {"5", "5", "6", "6"},
        {"7", "7"}
        };

        String[][] wrongCharMatrix = {
        {"1", "1", "2", "2"},
        {"3", "3", "4", "4"},
        {"5", "5", "6", "6"},
        {"7", "7", "O", "0"}
        };

        try {
        System.out.println("Первый массив:");
        System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(correctMatrix) + ".\n");
        } catch (CustomException e) {
        e.getMessage();
        }

        try {
        System.out.println("Второй массив:");
        System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(wrongSizeMatrix) + ".\n");
        } catch (CustomException e) {
        System.out.println(e.getMessage());
        }

        try {
        System.out.println("Третий массив:");
        System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(wrongCharMatrix) + ".\n");
        } catch (CustomException e) {
        System.out.println(e.getMessage());
        }
}

static class Converter {
    static int strConverter(String[][] strArray)
            throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (4 != strArray.length) throw new MyArraySizeException();
        for (int i = 0; i < strArray.length; i++) {
            if (4 != strArray[i].length) throw new MyArraySizeException();
            for (int k = 0; k < strArray[i].length; k++) {
                try {
                    sum += Integer.parseInt(strArray[i][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, k);
                }
            }
        }

        return sum;
    }
}



    private static void Calculate(double[][] human) {

        for (int i = 0; i < human.length; i++) {
            for (int j = 0; j < human[i].length; j += 2) {
                double bmi = human[i][j] / (human[i][j + 1] * human[i][j + 1]);

                System.out.printf("Weight: %.2f\tHeight: %.2f | BMI: %.2f | ", human[i][j], human[i][j + 1], bmi);

                if (bmi < 18.5) {
                    System.out.print("Underweight\n");
                } else if (bmi > 18.5 && bmi < 25.0) {
                    System.out.print("Normal\n");
                } else if (bmi > 25.0 && bmi < 30.0) {
                    System.out.print("Overweight\n");
                } else {
                    System.out.print("Obesity\n");
                }
            }
        }
    }
}
