package com.cc.java;

public class App {
   
 public static void main(String[] args) {

   /** Typkonvertierung  */
   output(String.valueOf(2));  // int --> String
   output(Integer.toString(3)); // int --> String
   output("Das ist eine Ziffer: " + 4); // int --> String

   System.out.println("------------------");

   Cat cat = new Cat("Grizabella", 29);
   output("Name: " + cat.getName());
   output("Alter: " + cat.getAge());
    
   System.out.println("------------------");

   Cat cat1 = new Cat("Alonzo", 35);
   output("Name: " +  cat1.getName());
   output("Alter: " + cat1.getAge());

 }

 private static void output(String inputStr) {
   System.out.println(inputStr);
 }

//  // evtl.überladene Methode
//  private static void output(int inputNum) {
//    System.out.println(inputNum);
//  }


}

