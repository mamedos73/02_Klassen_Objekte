package com.cc.java;

public class Cat {
    
    private String name;
    private int age; 

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* Getter */
    public String getName() {
        if (getPermission()) {
            return name; 
        } else {
            return "Sorry, no permission!";
        }
    }

    public int getAge() {
        return this.age;
    }


    /* Setter */
    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    private boolean getPermission() {
        return true;   
    }


}
