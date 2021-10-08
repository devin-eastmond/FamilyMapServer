package service;

import request.LoadRequest;
import response.Response;

/**
 * The service class that implements load requests
 */
public class LoadService {

    /**
     * Clears all data from the database (just like the /clear API), and then loads the posted user, person, and event data into the database.
     *
     * @param loadRequest the load request from the client
     * @return a load response or an error response
     */
    Response load(LoadRequest loadRequest) {
        return null;
    }
}
