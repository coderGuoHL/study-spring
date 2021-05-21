package com.guo.demo03;

public class Client {
    public static void main(String[] args) {
        LandLord landLord = new LandLord();

        ProxyInvocationHandle pih = new ProxyInvocationHandle();
        pih.setRent(landLord);

        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();
    }
}
