package com.example.loosecoupling;

public class WebServiceUserDetailsImpl implements UserDetailsProvider{
    @Override
    public String getUserDetails() {
        return  "User details from webservice";
    }
}
