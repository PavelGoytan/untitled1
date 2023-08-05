package org.example;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        String l = "https://crm.andersenlab.com/request-for-specialist/9999";
        String substring = "";

        if (isValidUrl(l)){
            substring = l.substring(l.lastIndexOf("/")+1);
        }


        System.out.println(substring);
    }

    static boolean isValidUrl(String url){
        try {
            new URL(url);
            return true;
        } catch (MalformedURLException e) {
            return false;
        }
    }
}