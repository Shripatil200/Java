package com.example.serilization_decerialization;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private String email;
    transient private String password;
    private int age;
    private Address address;

    public User() {
    }

    public User(String name, String email, String password, int age, Address address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.address = address;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
