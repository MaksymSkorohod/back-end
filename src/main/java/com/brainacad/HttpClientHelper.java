package com.brainacad;

import io.qameta.allure.Step;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HttpClientHelper {

    private static Map<String, String> headers=new HashMap<>();

    static {
        headers.put("Content-Type", "application/json");
    }


    //REST GET запрос
    @Step
    public static HttpResponse get(String endpointUrl, String parameters) throws IOException {
        HttpClient client = HttpClientBuilder.create().build(); //Создаём экземпляр HTTP клиента

        HttpGet request = new HttpGet(endpointUrl+"?"+parameters); //Создаём HTTP GET запрос из URL и параметров

        for(String headerKey:headers.keySet()) {
            request.addHeader(headerKey, headers.get(headerKey)); //добавляем в запрос необходимые хедеры
        }

        HttpResponse response = client.execute(request); //выполняем запрос в HTTP клиенте и получаем ответ

        return response; //возвращаем response
    }

    @Step
    public static HttpResponse post(String endpointUrl, String parameters, String body) throws IOException {
        if (parameters != null) {
            endpointUrl = endpointUrl+"?"+parameters;
        }

        Map<String, String> headers = new HashMap<>();

        headers.put("Content-Type", "application/json");

        //TODO: написать метод для POST запроса с хедерами по умолчанию *********
        return post(endpointUrl, body, headers);
    }

    @Step
    public static HttpResponse post(String endpointUrl, String body, Map<String, String> headers) throws IOException{

        HttpClient client = HttpClientBuilder.create().build(); //Создаём экземпляр HTTP клиента

        HttpPost post = new HttpPost(endpointUrl);

        for(String headerKey:headers.keySet()) {
            post.addHeader(headerKey, headers.get(headerKey)); //добавляем в запрос необходимые хедеры
        }

        if (body != null) {
            post.setEntity(new StringEntity(body)); //добавляем к запросу тело запроса
        }

        HttpResponse response = client.execute(post);  //выполняем запрос в HTTP клиенте и получаем ответ

        return response; //возвращаем response
    }


    @Step
    public static String getBodyFromResponse(HttpResponse response) throws IOException {

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));  //создаём ридер буффера и передаём в него входящий поток респонса

        StringBuffer result = new StringBuffer();
        String line;

        while ((line = rd.readLine()) != null) {
            result.append(line); //получаем в цикле построчно строки из входящего потока и собираем в одну строку
        }
        return result.toString();
    }


    @Step
    public static HttpResponse put(String endpointUrl, String body, Map<String, String> headers) throws IOException{

        HttpClient client = HttpClientBuilder.create().build(); //Создаём экземпляр HTTP клиента


        HttpPut put = new HttpPut(endpointUrl);  //Создаём HTTP POST запрос из URL и параметров

        for(String headerKey:headers.keySet()) {
            put.addHeader(headerKey, headers.get(headerKey)); //добавляем в запрос необходимые хедеры
        }


        if (body != null) {
            put.setEntity(new StringEntity(body)); //добавляем к запросу тело запроса
        }

        HttpResponse response = client.execute(put);  //выполняем запрос в HTTP клиенте и получаем ответ

        return response; //возвращаем response
    }

    @Step
    public static HttpResponse patch(String endpointUrl, String body, Map<String, String> headers) throws IOException{

        HttpClient client = HttpClientBuilder.create().build(); //Создаём экземпляр HTTP клиента


        HttpPatch patch = new HttpPatch(endpointUrl);  //Создаём HTTP POST запрос из URL и параметров

        for(String headerKey:headers.keySet()) {
            patch.addHeader(headerKey, headers.get(headerKey)); //добавляем в запрос необходимые хедеры
        }


        if (body != null) {
            patch.setEntity(new StringEntity(body)); //добавляем к запросу тело запроса
        }

        HttpResponse response = client.execute(patch);  //выполняем запрос в HTTP клиенте и получаем ответ

        return response; //возвращаем response
    }

    @Step
    public static HttpResponse delete(String endpointUrl, String parameters) throws IOException {
        HttpClient client = HttpClientBuilder.create().build();

        HttpDelete request = new HttpDelete(endpointUrl+"?"+parameters);

        for(String headerKey:headers.keySet()) {
            request.addHeader(headerKey, headers.get(headerKey));
        }

        HttpResponse response = client.execute(request);

        return response;
    }


    //TODO: допишите методы для запросов PUT, PATCH и DELETE
}
