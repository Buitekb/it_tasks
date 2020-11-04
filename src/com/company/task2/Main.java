package com.company.task2;

public class Main {
    //Создать класс Person, который содержит:
    //a) поля fullName, age.
    //б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
    //в) Добавьте два конструктора  - Person() и Person(fullName, age).
    //Создайте два объекта этого класса.
    // Один объект инициализируется конструктором Person(), другой - Person(fullName, age).

    public static void main(String[] args) {
        // write your code here
        Person person1 = new Person();
        Person person2 = new Person("Bayan Buitek", 20);
        person1.move();
        person2.talk();
    }
}