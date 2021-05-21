package com.guo.demo;

public class Proxy implements Rent{
    private LandLord landLord;

    public Proxy() {
    }

    public Proxy(LandLord landLord) {
        this.landLord = landLord;
    }

    public void fare() {
        System.out.println("中介收取保护费用");
    }

    public void compact() {
        System.out.println("中介签合同");
    }

    public void rent() {
        landLord.rent();
        fare();
        compact();
    }
}
