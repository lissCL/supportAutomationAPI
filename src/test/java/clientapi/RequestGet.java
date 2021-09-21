package clientapi;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class RequestGet extends RequestClient {
    @Override
    public ResponseInformation send(RequestInformation request) {

        Response response = this.client.given()
                .contentType(ContentType.JSON)
                .header("Content-Type", "application/json")
                .when()
                .get(request.getUrl());

        return new ResponseInformation(response.getBody(), response.getStatusCode(), response);
    }

}