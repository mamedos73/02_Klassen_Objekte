package com.cc.java;

public class App {
   
 public static void main(String[] args) {

    Cat cat = new Cat("Grizabella", 29);
    System.out.println(cat.tellYourName());
    System.out.println(cat.tellYourAge());
    
    System.out.println("------------------");

    Cat cat1 = new Cat("Alonzo", 35);
    System.out.println(cat1.tellYourName());
    System.out.println(cat1.tellYourAge());

 }

}

