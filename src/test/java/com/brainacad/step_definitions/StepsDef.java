package com.brainacad.step_definitions;

import com.brainacad.HttpClientHelper;
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

    @When("I send GET request on endpoint {string} and parameters {string}")
    public void i_send_GET_request_on_endpoint_and_parameters(String endpoint, String parameters) throws IOException {
        response = HttpClientHelper.get(URL+endpoint,parameters);

    }

    @Then("I get response status code {string}")
    public void i_get_response_status_code(String statusCodeString) {
        int statusCode = Integer.parseInt(statusCodeString);
        Assert.assertEquals("Wrong status Code", statusCode, response.getStatusLine().getStatusCode());
    }

    @Then("I get body not null")
    public void iGetBodyNotNull() throws IOException {
        String body=HttpClientHelper.getBodyFromResponse(response);
        Assert.assertNotEquals("Body shouldn't be null", null, body);
    }
}
