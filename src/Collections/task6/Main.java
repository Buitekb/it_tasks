package Collections.task6;

import java.util.Scanner;

public class Main {
    //Создайте пример наследования, реализуйте класс Student и класс Aspirant,
    // аспирант отличается от студента наличием некой научной работы.
    //а) Класс Student содержит переменные: String firstName, lastName, group.
    // А также double averageMark, содержащую среднюю оценку.
    //б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
    //в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
    // Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе Aspirant.
    // Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
    //г) Создать массив типа Student, содержащий объекты класса Student и Aspirant.
    // Вызвать метод getScholarship() для каждого элемента массива.
    public static void main(String[] args) {
        Student[] mas=new Student[2];
        Scanner scan = new Scanner(System.in);
        System.out.println("choose one role: \n1.Student \n2.Aspirant");
        int choose = scan.nextInt();
        switch (choose){
            case 1:
                System.out.println("Enter you average mark");
                double mark = scan.nextDouble();
                mas[0] = new Student("Bayan", "Buitek", "133",mark);
                System.out.println("Your scholarship:  "+ mas[0].getScholarship() + " grn.");
                break;
            case 2:
                System.out.println("Enter you average mark");
                double mark2 = scan.nextDouble();
                mas[1]=new Aspirant("Aida", "Sultanova", "122", mark2,"IT");
                System.out.println("Your scholarship:  "+ mas[1].getScholarship() + " grn.");
                break;
        }

    }
}
