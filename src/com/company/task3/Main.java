package com.company.task3;

public class Main {
    //Создать класс "Матрица". Класс должен иметь следующие поля:
    //1) двумерный массив вещественных чисел;
    //2) количество строк и столбцов в матрице.
    //
    //Класс должен иметь следующие методы:
    //1) сложение с другой матрицей;
    //2) умножение на число;
    //3) вывод на печать;
    //4) умножение матриц - по желанию.

    public static void main(String[] args) {
        int[][] elem1 = new int[][]{
                new int[]{1, 2, 3},
                new int[]{5, 8, 9},
                new int[]{10, 1, 4}
        };

        int[][] elem2 = new int[][]{
                new int[]{10, 2, 3},
                new int[]{7, 8, 9},
                new int[]{14, 3, 6}
        };

        Matrix matrix1 = new Matrix(elem1);
        Matrix matrix2 = new Matrix(elem2);
        System.out.println("Sum of two matrix:");
        Matrix res = matrix1.sum(matrix2);
        System.out.println(res);

        System.out.println("Multiplication two matrix: ");
        Matrix res1 = matrix1.multiplication((matrix2));
        System.out.println(res1);

        System.out.println("Enter number to multiply: ");
        Matrix res2 = matrix1.multiplyToNumber(matrix2);
        System.out.println(res2);




    }
}
