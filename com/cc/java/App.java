package com.cc.java;

public class App {
   
 public static void main(String[] args) {

    Cat cat = new Cat();
    System.out.println("Blick von aussen: " + cat);
    cat.tellYourAddress();

    Cat cat1 = new Cat();
    System.out.println("Blick von aussen: " + cat1);
    cat1.tellYourAddress();

 }
 

}

