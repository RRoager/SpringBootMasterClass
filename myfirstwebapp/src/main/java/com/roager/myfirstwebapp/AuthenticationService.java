package com.roager.myfirstwebapp;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        boolean isValidUserName = username.equalsIgnoreCase("Rasmus");
        boolean isValidPassword = password.equalsIgnoreCase("Roager");

        return isValidUserName && isValidPassword;
    }

}
