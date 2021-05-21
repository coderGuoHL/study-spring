package com.guo.demo;

public class User {
    public static void main(String[] args) {
        LandLord landLord = new LandLord();
        Proxy proxy = new Proxy(landLord);
        proxy.rent();
    }
}
