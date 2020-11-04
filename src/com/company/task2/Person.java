package com.company.task2;

public class Person {
    private String fullName;
    private int age;

    // методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит"
    public Person(){}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move(){
        System.out.println(fullName + " говорит");
    }
    public void talk(){
        System.out.println(fullName + " говорит");
    }


}
