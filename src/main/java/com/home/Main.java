package com.home;

import com.home.services.UserService;

/**
 * Created by user on 30.05.2017.
 */
public class Main{
    public static void main(String[] args){
        UserService userService = new UserService();

        System.out.println(userService.login("login", "password"));
    }
}
