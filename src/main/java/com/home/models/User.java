package com.home.models;

import java.io.Serializable;

/**
 * Created by user on 28.05.2017.
 */

public class User implements Serializable{
    private Long id;
    private String name;
    private String login;
    private String password;
    private Boolean isAdmin;
    private Diet diet;

    public User(){
    }

    public User(String name, String login, String password, Boolean isAdmin){
        this.name = name;
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
        this.diet = diet;
    }

    public User(String login, String password, Boolean admin){
        this.login = login;
        this.password = password;
        this.isAdmin = admin;
    }

    public Long getId(){
        return id;
    }

    private void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public Boolean getIsAdmin(){
        return isAdmin;
    }

    public void setIsAdmin(Boolean admin){
        this.isAdmin = admin;
    }

    public Boolean getAdmin(){
        return isAdmin;
    }

    public void setAdmin(Boolean admin){
        isAdmin = admin;
    }

    public Diet getDiet(){
        return diet;
    }

    public void setDiet(Diet diet){
        this.diet = diet;
    }

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", diet=" + diet +
                '}';
    }
}
