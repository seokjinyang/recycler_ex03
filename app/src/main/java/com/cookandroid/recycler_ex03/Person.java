package com.cookandroid.recycler_ex03;

public class Person {
    String name;
    String mobile;


    public Person(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name=name;
    }

    public String getMobile(){
        return mobile;
    }
    public void setMobile(){
        this.mobile=mobile;
    }

}
