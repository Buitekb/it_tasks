package com.company.task4;

import java.util.ArrayList;

//Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
// ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
//Разработать программу, в которой создается массив объектов данного класса.
// Перегрузить методы takeBook(), returnBook():
public class Reader {
    private String name;
    private String lastName;
    private int numberOfTicket;
    private String numberOfPhone;
    private int counter;

    public Reader(){};
    public Reader(String name, String lastName, int numberOfTicket, String numberOfPhone) {
        this.name = name;
        this.lastName = lastName;
        this.numberOfTicket = numberOfTicket;
        this.numberOfPhone = numberOfPhone;
    }

    //region Constructors
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }


    //endregion





    //region Reader
//    public Reader(){}
//
//    public void returnBook(int counter) {
//        System.out.println(template(counter, true));
//    }
//
//    public void takeBook(int counter) {
//        System.out.println(template(counter, false));
//    }
//
//    private String template(int counter, boolean isReturn) {
//        if(isReturn) {
//            return lastName + " " + name + " вернул " + counter + " книги";
//        } else {
//            return lastName + " " + name + " взял " + counter + " книги";
//        }
//    }
    //endregion




    //Region Comment
//    public void takeBook(String str){
//        String[] books = new String[]{
//          "Приключения, "
//        };
//
    }
    //    public Matrix multiplyToNumber(Matrix matrix){
    //        int[][] multiply = new int[rows][];
    //        Scanner sc = new Scanner(System.in);
    //        int number = sc.nextInt();
    //
    //        for (int i = 0; i < multiply.length; i++){
    //            int[] temp = new int[columns];
    //            for (int j = 0; j < temp.length; j++){
    //                temp[j] = matrix.getElements()[i][j] * number;
    //            }
    //            multiply[i] = temp;
    //        }
    //        return new Matrix(multiply);
    //    }

//    public void takeBook(String str) {
//
//        String[] objArray = new String[3];
//        objArray[0] = new String("Приключения, ");
//        objArray[1] = new String("Словарь, ");
//        objArray[2] = new String("Энциклопедия");
//        System.out.print("\n" + name+" " +surName+ " взял кнги: ");
//        for (int i = 0; i < 3; i++) {
//
//            System.out.print(objArray[i]);
//        }
//
//    }

//    public void returnBook() {
//        int returnBook = 3;
//        System.out.println("\n\n" + name+" " +surName+ " вернул " + returnBook + " книги");
//    }
//
//    public void returnBook(String str) {
//
//        String[] objArray = new String[3];
//        objArray[0] = new String("Приключения, ");
//        objArray[1] = new String("Словарь, ");
//        objArray[2] = new String("Энциклопедия");
//        System.out.print("\n" + name+" " +surName+ " вернул кнги: ");
//        for (int i = 0; i < 3; i++) {
//
//            System.out.print(objArray[i]);
//        }
//    }

//}

//endRegion
