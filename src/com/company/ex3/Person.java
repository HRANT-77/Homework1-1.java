package com.company.ex3;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public void compareAge(Person p2){
        if(p2.age > this.age)
            System.out.println(p2.name + " is older than me.");
        if(p2.age < this.age)
            System.out.println(p2.name + " is younger than me.");
        if(p2.age == this.age)
            System.out.println(p2.name + " is the same age as me.");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0&&age<125) {
            this.age = age;
        }
    }
}
