package clientapi;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class ResponseInformation {

    private Response response;
    private ResponseBody responseBody;
    private String responseMessage;
    private int responseCode;

    public ResponseInformation(){}

    public ResponseInformation(ResponseBody responseBody, int responseCode, Response response){
        this.responseBody = responseBody;
        this.responseCode = responseCode;
        this.response = response;

    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public void setResponseBody(ResponseBody responseBody) {
        this.responseBody = responseBody;
    }

    public Response getResponse() {
        return response;
    }

    public ResponseBody getResponseBody() {
        return responseBody;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public int getResponseCode() {
        return responseCode;
    }
}