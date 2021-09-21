package clientapi;

import io.restassured.http.Headers;

import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import java.util.HashMap;
import java.util.Map;


public class RequestInformation {

    private String url;
    private Object body;
    //private Headers headers = new Headers();
   // private MultivaluedMap<String, Object> multipart = new MultivaluedHashMap<>();
    private HashMap<String, String> queryParams = new HashMap<>();

    //private String url;
    private Map<String, String> params = new HashMap<>();
    private MultivaluedMap <String, Object> headers= new MultivaluedHashMap<>();
    //private String body;


    public MultivaluedMap<String, Object> getHeaders() {
        return headers;
    }

    public RequestInformation() {
    }

    public RequestInformation(String url, Object body) {
        this.url = url;
        this.body = body;
    }

    public RequestInformation(String url, Map<String, String> params, MultivaluedMap<String, Object> headers, String body) {
        this.url = url;
        this.params = params;
        this.headers = headers;
        this.body = body;
    }


    public void addHeaders(String attribute,String value){
        this.headers.add(attribute,value);
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public void setBody(Object body) {
        this.body = body;
    }





    public String getUrl() {
        return url;
    }

    public Object getBody() {
        return body;
    }




    public HashMap<String, String> getQueryParams() {
        return queryParams;
    }
}
