package com.example.loosecoupling;

public class UserModule {

    private   UserDetailsProvider userDetailsProvider;
    public UserModule(UserDetailsProvider  userDetailsProvider){
        this.userDetailsProvider = userDetailsProvider;
    }

    public  String getUserInfo(){
       return userDetailsProvider.getUserDetails();
    }
}
