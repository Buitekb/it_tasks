package com.company.task3;

import java.util.Scanner;

public class Matrix {
    private int[][] elements;
    private int rows;
    private int columns;
    private int number;


    public Matrix(int[][] elements){
        this.elements = elements;
        rows = elements.length;
        columns = rows;
    }

    public int[][] getElements() {
        return elements;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Matrix sum(Matrix matrix){
        int[][] mas = new int[rows][];

        for (int i = 0; i < mas.length; i++){
            int[] temp = new int[columns];
            for (int j = 0; j < temp.length; j++){
                temp[j] = matrix.getElements()[i][j] + this.getElements()[i][j];
            }
            mas[i] = temp;
        }
        return new Matrix(mas);
    }

    public Matrix multiplication(Matrix matrix){
        int[][] multiplication = new int[rows][];

        for (int i = 0; i < multiplication.length; i++){
            int[] temp = new int[columns];
            for (int j = 0; j < temp.length; j++){
                temp[j] = matrix.getElements()[i][j] * this.getElements()[i][j];
            }
            multiplication[i] = temp;
        }
        return new Matrix(multiplication);
    }

    public Matrix multiplyToNumber(Matrix matrix){
        int[][] multiply = new int[rows][];
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < multiply.length; i++){
            int[] temp = new int[columns];
            for (int j = 0; j < temp.length; j++){
                temp[j] = matrix.getElements()[i][j] * number;
            }
            multiply[i] = temp;
        }
        return new Matrix(multiply);
    }


    @Override
    public String toString() {
        String e = "";
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                e+=elements[i][j] + " ";
            }
            e += "\n";

        }
        return "Matrix{\n" + e + '}';
    }
}
