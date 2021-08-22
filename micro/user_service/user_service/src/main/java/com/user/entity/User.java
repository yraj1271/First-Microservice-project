package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    public List<Contact> getContacts() {
        return contacts;
    }

    public User(long userId) {
        this.userId = userId;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    private long userId;
    private String name;
    private String phone;
    List<Contact> contacts=new ArrayList<>();
    public User(long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", contacts=" + contacts +
                '}';
    }

    public User(long userId, String name, String phone, List<Contact> contacts) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
