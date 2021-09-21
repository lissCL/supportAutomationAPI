package clientapi;

import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;


public abstract class RequestClient {

    RequestSpecification client = SerenityRest.given();

    public abstract ResponseInformation send (RequestInformation request);
}