package com.home.utils;

/**
 * Created by user on 30.05.2017.
 */
public class ServerConfiguration{
    public static final String SERVER_HOST = "localhost";
    public static final String SERVER_PORT = "8080";

    public static String getAddress() {
        return "http://" + SERVER_HOST + ":" + SERVER_PORT;
    }
}
