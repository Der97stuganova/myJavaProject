package lesson6;

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
}

