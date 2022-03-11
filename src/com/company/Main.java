package com.company;

public class Main {

    public static void main(String[] args) {
        Popugai popugai = new Popugai();
        Balyk balyk = new Balyk();
        Cat cat = new Cat();
        Dog dog = new Dog();
        popugai.setColor("jeltyi");
        popugai.setAge(2);

        balyk.setName("forel");
        balyk.setSalmagy(5);

        cat.setColor("black");
        cat.setAge(3);

        dog.setName("laika");
        dog.setParodasy("taigan");



        System.out.println("popugaidyn sveti " + popugai.getColor());
        System.out.println("popugaidyn jashy " + popugai.getAge());
        System.out.println("balyktyn aty " + balyk.getName());
        System.out.println("balyktyn salmagy " + balyk.getSalmagy());
        System.out.println("myshyktyn tusu " + cat.getColor());
        System.out.println("myshyktyn jashy " + cat.getAge());
        System.out.println("ittin aty " + dog.getName());
        System.out.println("ittin pparodasy " + dog.getParodasy());


    }
}
