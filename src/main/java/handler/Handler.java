package handler;

import request.Request;
import response.Response;

abstract public class Handler {
    abstract Response handle();

    protected Response encode() {
        return null;
    }

    protected Request decode(Response response) {
        return null;
    }
}
