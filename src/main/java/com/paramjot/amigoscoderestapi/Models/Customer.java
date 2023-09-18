package com.paramjot.amigoscoderestapi.Models;

public class Customer {

    public Customer(int id, String name, String email, int age) {
        Id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    int Id;
    String name;
    String email;
    int age;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
