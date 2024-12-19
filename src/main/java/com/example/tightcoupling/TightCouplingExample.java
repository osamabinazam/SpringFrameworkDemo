package com.example.tightcoupling;

public class TightCouplingExample {
    public static void main(String[] args) {
        UserModule userModule  = new UserModule();
        System.out.println(userModule.getUserInfo());
    }
}
