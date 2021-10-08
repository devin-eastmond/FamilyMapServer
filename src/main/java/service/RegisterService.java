package service;

import request.RegisterRequest;
import response.Response;

/**
 * The service class that implements register requests
 */
public class RegisterService {

    /**
     * Creates a new user account, generates 4 generations of ancestor data for the new user, logs the user in, and returns an auth token.
     *
     * @param registerRequest the register request from the client
     * @return a register response containing the auth token or an error response
     */
    public Response register(RegisterRequest registerRequest) {
        return null;
    }
}
