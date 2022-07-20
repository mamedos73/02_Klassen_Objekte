package com.cc.java;

public class App {
   
 public static void main(String[] args) {

    Cat cat = new Cat();
    cat.name = "Grizabella";
    cat.age = 29;
    System.out.println(cat.tellYourName());
    System.out.println(cat.tellYourAge());
    
    System.out.println("------------------");

    Cat cat1 = new Cat();
    cat1.name = "Alonzo";
    cat1.age = 35;
    System.out.println(cat1.tellYourName());
    System.out.println(cat1.tellYourAge());

 }

}

