package com.example.loosecoupling;

public class DatabaseUserDetailsImpl implements UserDetailsProvider{
    @Override
    public String getUserDetails(){
        return "User Detail form Database";
    }
}
