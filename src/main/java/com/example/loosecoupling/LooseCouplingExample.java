package com.example.loosecoupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDetailsProvider database  =  new DatabaseUserDetailsImpl();
        UserDetailsProvider webService = new WebServiceUserDetailsImpl();
        UserModule module = new UserModule(database);
        System.out.println(module.getUserInfo());

        module = new UserModule(webService);
        System.out.println(module.getUserInfo());
    }
}
