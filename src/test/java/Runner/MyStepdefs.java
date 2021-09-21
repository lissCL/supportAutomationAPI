package Runner;

import clientapi.FactoryRequest;
import clientapi.RequestInformation;
import clientapi.ResponseInformation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import helpers.JsonHelper;

import org.json.JSONException;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import static configuration.Configuration.*;

public class MyStepdefs {
    ResponseInformation response = new ResponseInformation();
    Map<String,String> variables= new HashMap<>();

    @Given("^the user has authentication to todo\\.ly$")
    public void theUserHasAuthenticationToTodoLy() {
    }

    @When("^the user send (POST|PUT|DELETE|GET) request '(.*)' with json and (BASIC|TOKEN) authentication$")
    public void theUserSendPOSTRequestApiUserJsonWithJsonAndBASICAuthentication(String method, String url, String authentication, String jsonBody) {
        RequestInformation requestInformation = new RequestInformation();
        //requestInformation.setUrl(this.replaceVariables(url));
       //requestInformation.setBody(this.replaceVariables(jsonBody));
        requestInformation.setUrl(HOST+this.replaceVariables(url));
        requestInformation.setBody(this.replaceVariables(jsonBody));
        if (authentication.equals("TOKEN")) {
//            this.authentication = authentication;
            requestInformation.addHeaders(TOKEN_AUTHENTICATION_HEADER, this.replaceVariables(authentication));
        }else {
            requestInformation.addHeaders(BASIC_AUTHENTICATION_HEADER, BASIC_AUTHENTICATION);

        }

        response = FactoryRequest.make(method.toLowerCase()).send(requestInformation);

    }

    @Then("^the user expected the response code (\\d+)$")
    public void theUserExpectedTheResponseCode(int expectedResponseCode) {
        System.out.println(" Response Code "+response.getResponseCode());
        Assert.assertEquals("ERROR !! the response code es incorrecto",expectedResponseCode,response.getResponseCode());

    }


    private String replaceVariables(String value){
        for (String key:this.variables.keySet()
        ) {
            value = value.replace(key,this.variables.get(key));
        }
        return value;
    }
}
