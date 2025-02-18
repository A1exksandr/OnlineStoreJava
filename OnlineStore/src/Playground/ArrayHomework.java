package Playground;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] array1 = {5, 4, 3, 2, 1};
        int len = 0;
        int sumValue = 0;
        for (int i = 0; i < array1.length; i++) {
            len++;
            sumValue += array1[i];
        }

        double averageValue = sumValue / len;
        System.out.println("Длинна массива: " + len);
        System.out.println("Среднее значение элементов: " + averageValue);

        int[][] array2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Суммы столбцов:");
        for (int i = 0; i < array2[0].length; i++) {
            int columnSum = 0;
            for (int j = 0; j < array2.length; j++) {
                columnSum += array2[j][i];
            }
            System.out.print(columnSum + " ");
        }
        System.out.println();
        System.out.println("Суммы строк:");
        for (int i = 0; i < array2.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array2[0].length; j++) {
                rowSum += array2[i][j];
            }
            System.out.print(rowSum + " ");
        }
        System.out.println();
        int maxElement = array2[0][0];
        int maxI = 0;
        int maxJ = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                if (array2[i][j] > maxElement) {
                    maxElement = array2[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
            System.out.println("Максимальный элемент массива: " + maxElement);
            System.out.println("Координаты - i:" + maxI + " j:" + maxJ);


    }
}
