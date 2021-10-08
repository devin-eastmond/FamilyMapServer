package service;

import request.FillRequest;
import response.Response;

/**
 * The service class that implements fill requests
 */
public class FillService {
    /**
     * Populates the server's database with generated data for the specified username.
     * The required "username" parameter must be a user already registered with the server.
     * If there is any data in the database already associated with the given username, it is deleted.
     * The optional “generations” parameter lets the caller specify the number of generations of ancestors to be generated,
     * and must be a non-negative integer (the default is 4, which results in 31 new persons each with associated events).
     *
     * @param fillRequest the fill request from the client
     * @return a fill response or an error response
     */
    Response fill(FillRequest fillRequest) {
        return null;
    }
}
