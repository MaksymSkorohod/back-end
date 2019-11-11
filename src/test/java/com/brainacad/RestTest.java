package com.brainacad;

public class RestTest{
    /*
    private static final String URL="https://reqres.in/";

    @Test//GET метод
    public void checkGetResponseStatusCode() throws IOException {
        String endpoint="/api/users";

        //TODO: Избавится он хедеров в тесте добавив методы с хедерами по умолчанию в класс HttpClientHelper

        HttpResponse response = HttpClientHelper.get(URL+endpoint,"page=2"); // и сохраняем результат в переменную response.

        int statusCode = response.getStatusLine().getStatusCode();  //получаем статус код из ответа
        System.out.println("Response Code : " + statusCode);
        Assert.assertEquals("Response status code should be 200", 200, statusCode);
    }

    @Test//GET метод
    public void checkGetAllUsers() throws IOException {
        String endpoint="/api/users?page=2";

        HttpResponse response = HttpClientHelper.get(URL+endpoint,"page=2"); // и сохраняем результат в переменную response.
        int statusCode = response.getStatusLine().getStatusCode();  //получаем статус код из ответа
        System.out.println("Response Code : " + statusCode);
        Assert.assertEquals("Response status code should be 200", 200, statusCode);
    }

    @Test//GET метод
    public void checkGetResponseBodyNotNull() throws IOException {
        String endpoint="/api/users";

        //TODO: Избавится он хедеров в тесте добавив методы с хедерами по умолчанию в класс HttpClientHelper

        HttpResponse response = HttpClientHelper.get(URL+endpoint,"page=2");  // и сохраняем результат в переменную response.


        String body=HttpClientHelper.getBodyFromResponse(response);
        System.out.println(body);
        Assert.assertNotEquals("Body shouldn't be null", null, body);  //Конвертируем входящий поток тела ответа в строку
    }

    @Test//POST метод
    public void checkPostResponseStatusCode() throws IOException {
        String endpoint="/api/users";

        Map<String, String> headers=new HashMap<>(); //Создаём переменую headers типа Map

        headers.put("Content-Type", "application/json"); //Добавляем в headers наш заголовок

        String requestBody="{\"name\": \"morpheus\",\"job\": \"leader\"}";  //создаём тело запроса

        //Выполняем REST POST запрос с нашими параметрами
        HttpResponse response = HttpClientHelper.post(URL+endpoint,requestBody, headers);  // и сохраняем результат в переменную response.

        int statusCode = response.getStatusLine().getStatusCode(); //получаем статус код из ответа
        System.out.println("Response Code : " + statusCode);
        Assert.assertEquals("Response status code should be 201", 201, statusCode);
    }

    @Test//POST метод
    public void checkPostResponseBodyNotNull() throws IOException {
        String endpoint="/api/users";

        //TODO: Избавится он хедеров в тесте добавив методы с хедерами по умолчанию в класс HttpClientHelper

        Map<String, String> headers=new HashMap<>(); //Создаём переменую headers типа Map

        headers.put("Content-Type", "application/json");  //Добавляем в headers наш заголовок

        String requestBody="{\"name\": \"morpheus\",\"job\": \"leader\"}"; //создаём тело запроса

        //Выполняем REST POST запрос с нашими параметрами
        HttpResponse response = HttpClientHelper.post(URL+endpoint,requestBody, headers); // и сохраняем результат в переменную response.

        String body=HttpClientHelper.getBodyFromResponse(response); //Конвертируем входящий поток тела ответа в строку
        System.out.println(body);
        Assert.assertNotEquals("Body shouldn't be null", null, body);
    }

    @Test//PUT метод
    public void checkPutResponseBodyNotNull() throws IOException {
        String endpoint="/api/users";

        //TODO: Избавится он хедеров в тесте добавив методы с хедерами по умолчанию в класс HttpClientHelper

        Map<String, String> headers=new HashMap<>(); //Создаём переменую headers типа Map

        headers.put("Content-Type", "application/json");  //Добавляем в headers наш заголовок

        String requestBody="{\"name\": \"morpheus\",\"job\": \"leader\"}"; //создаём тело запроса

        //Выполняем REST POST запрос с нашими параметрами
        HttpResponse response = HttpClientHelper.put(URL+endpoint,requestBody, headers); // и сохраняем результат в переменную response.

        String body=HttpClientHelper.getBodyFromResponse(response); //Конвертируем входящий поток тела ответа в строку
        System.out.println(body);
        Assert.assertNotEquals("Body shouldn't be null", null, body);
    }

    @Test//PATCH метод
    public void checkPatchResponseBodyNotNull() throws IOException {
        String endpoint="/api/users";

        //TODO: Избавится он хедеров в тесте добавив методы с хедерами по умолчанию в класс HttpClientHelper

        Map<String, String> headers=new HashMap<>();

        headers.put("Content-Type", "application/json");

        String requestBody="{\"name\": \"morpheus\"}";

        HttpResponse response = HttpClientHelper.patch(URL+endpoint,requestBody, headers); // и сохраняем результат в переменную response.

        String body=HttpClientHelper.getBodyFromResponse(response);
        System.out.println(body);
        Assert.assertNotEquals("Body shouldn't be null", null, body);
    }

    @Test//DELETE метод
    public void checkDeleteResponseBodyNotNull() throws IOException {
        String endpoint="/api/users/2";

        String requestBody="{\"name\": \"morpheus\",\"job\": \"leader\"}";

        HttpResponse response = HttpClientHelper.delete(URL+endpoint,null);

        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("Response Code : " + statusCode);
        Assert.assertEquals("Response status code should be 204", 204, statusCode);
    }


    //TODO: напишите по тесткейсу на каждый вариант запроса на сайте https://reqres.in
    //TODO: в тескейсах проверьте Result Code и несколько параметров из JSON ответа (если он есть)
*/
}
