package com.guo.pojo;

public class UserT {
    private String name;
    public UserT() {
        System.out.println("UserT 被初始化了");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("there is running");
    }
}
