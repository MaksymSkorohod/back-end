package com.brainacad.step_definitions;

import com.brainacad.HttpClientHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpResponse;
import org.junit.Assert;

import java.io.IOException;


public class StepsDef {

    private String URL;
    private HttpResponse response;

    @Given("I have server by URL {string}")
    public void i_have_server_by_URL(String url){
        URL = url;
    }

    @When("I send {get_delete} request on endpoint {string} and parameters {string}")
    public void i_send_GET_request_on_endpoint_and_parameters(String method, String endpoint, String parameters) throws IOException {
        switch (method) {
            case "GET":
            response = HttpClientHelper.get(URL + endpoint, parameters);
            break;
            case "DELETE":
                response = HttpClientHelper.delete(URL + endpoint, parameters);
                break;

        }
    }

    @When("I send {put_post_patch} request on endpoint {string} and body {string}")
    public void POST_request_on_endpoint_and_parameters(String method, String endpoint, String body) throws IOException {
System.out.println(body);
        switch (method) {
            case "PUT":
                response = HttpClientHelper.put(URL + endpoint, body);
                break;
            case "POST":
                response = HttpClientHelper.post(URL + endpoint, body);
                break;
            case "PATCH":
                response = HttpClientHelper.patch(URL + endpoint, body);
                break;
        }

    }

    @Then("I get response status code {digitString}")
    public void i_get_response_status_code(Integer statusCode) {
        Assert.assertEquals("Wrong status Code", statusCode, (Integer) response.getStatusLine().getStatusCode());
    }

    @Then("I get body not null")
    public void iGetBodyNotNull() throws IOException {
        String body=HttpClientHelper.getBodyFromResponse(response);
        Assert.assertNotEquals("Body shouldn't be null", null, body);
    }

    @And("Send {string} name and {string} job")
    public void sendNameAndJob(String name, String job) {


    }
}
