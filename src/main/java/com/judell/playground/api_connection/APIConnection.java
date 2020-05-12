package com.judell.playground.api_connection;

import com.sun.tools.javac.Main;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * New in java 11
 */
public class APIConnection {

    public static void main(String[] args) throws Exception{
        apiConnection();
    }

    public static void apiConnection() throws Exception{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost:8080/get-games")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(APIConnection::parse).join();
//                .thenAccept(System.out::println).join();
    }

    public static String parse(String resp){
        JSONArray gameNames = new JSONArray(resp);
        JSONObject gameName = gameNames.getJSONObject(0);
        String name = gameName.getString("gameName");
        System.out.println(name);
        return name;
    }
}