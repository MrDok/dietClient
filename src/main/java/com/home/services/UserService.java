package com.home.services;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.home.models.User;
import com.home.utils.ServerConfiguration;
import com.home.utils.Utils;

/**
 * Created by user on 30.05.2017.
 */
public class UserService{
    public User login(String login, String password){
        try{
            JsonElement jsonElement = Utils.getJson(createUrl(login, password));

            return new Gson().fromJson(jsonElement, User.class);
        }catch (Exception e){
            return null;
        }
    }

    private String createUrl(String login, String password){
        return ServerConfiguration.getAddress() + String.format("/login?login=%s&password=%s", login, password);
    }
}
