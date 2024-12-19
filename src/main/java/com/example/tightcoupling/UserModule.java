package com.example.tightcoupling;

public class UserModule {
    private UserDetails userDetails  = new UserDetails();

    public  String getUserInfo(){
        return  userDetails.getUserDetails();
    }
}
