package com.home.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by user on 30.05.2017.
 */
public class Utils{

    public static JsonElement getJson(String url){
        try{
            URL urlRequest = new URL(url);

            HttpURLConnection request = (HttpURLConnection) urlRequest.openConnection();
            request.connect();

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));

            return root;
        }catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args){
//        JsonElement elementSignIn = Utils.getJson("http://localhost:8080/signin?login=login&password=password");

        JsonElement element = Utils.getJson("http://localhost:8080/login?login=login&password=password");

        if (element != null){
            JsonObject object = element.getAsJsonObject();
            System.out.println(object);
        }else {
            System.out.println("null");
        }
    }
}
