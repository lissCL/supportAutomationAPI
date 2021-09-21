package clientapi;



public class FactoryRequest {

    public static RequestClient make(String type) {
        RequestClient client;
        switch (type) {

            case "post":
                client = new RequestPost();
                break;
            case "get":
                client = new RequestGet();
                break;
            case "delete":
                client = new RequestDelete();
                break;
            case "put":
                client = new RequestPut();
                break;
            default:
                client = new RequestGet();
                break;
        }
        return client;
    }
}