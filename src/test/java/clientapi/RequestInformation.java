package clientapi;

import io.restassured.http.Headers;

import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import java.util.HashMap;
import java.util.Map;

public class RequestInformation {

    private String url;
    private Object body;
    private Headers headers = new Headers();
    private MultivaluedMap<String, Object> multipart = new MultivaluedHashMap<>();
    private HashMap<String, String> queryParams = new HashMap<>();




    public RequestInformation() {
    }

    public RequestInformation(String url, Object body) {
        this.url = url;
        this.body = body;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    public void setMultipart(MultivaluedMap<String, Object> multipart) {
        this.multipart = multipart;
    }

    public void setQueryParams(HashMap<String, String> queryParams) {
        this.queryParams = queryParams;
    }

    public String getUrl() {
        return url;
    }

    public Object getBody() {
        return body;
    }

    public Headers getHeaders() {
        return headers;
    }

    public MultivaluedMap<String, Object> getMultipart() {
        return multipart;
    }

    public HashMap<String, String> getQueryParams() {
        return queryParams;
    }
}
