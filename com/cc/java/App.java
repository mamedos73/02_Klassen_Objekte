package com.cc.java;

public class App {
   
 public static void main(String[] args) {

    Cat cat = new Cat("Grizabela", 29);
    System.out.println(cat.getName());
    cat.setName("Grizabella");
    System.out.println(cat.getName());
    System.out.println(cat.getAge());
    
    System.out.println("------------------");

    Cat cat1 = new Cat("Alonzo", 35);
    System.out.println(cat1.getName());
    System.out.println(cat1.getAge());

 }

}

