package clientapi;


import io.restassured.http.ContentType;
import io.restassured.response.Response;

import javax.servlet.http.HttpServletResponse;


public class RequestPost extends RequestClient {

    @Override
    public ResponseInformation send(RequestInformation request) {

        Response response = this.client.given()
                .contentType(ContentType.JSON)
                .headers(request.getHeaders())
                .queryParams(request.getQueryParams())
                .body(request.getBody())
                .expect()
                .statusCode(HttpServletResponse.SC_OK)
                .when()
                .post(request.getUrl());

        return new ResponseInformation(response.getBody(), response.getStatusCode(), response);
    }
}
