package service;

import request.PersonRequest;
import request.PersonsRequest;
import response.Response;

/**
 * The service class that implements person requests
 */
public class PersonService {

    /**
     * Returns the single Person object with the specified ID.
     *
     * @param personRequest the person request from the client
     * @return a person response containing the person object or an error response
     */
    Response getPerson(PersonRequest personRequest) {
        return null;
    }

    /**
     * Returns ALL family members of the current user. The current user is determined from the provided auth token.
     *
     * @param personsRequest the persons request from the client
     * @return a persons response containing all family members of the current user or an error response
     */
    Response getPersons(PersonsRequest personsRequest) {
        return null;
    }
}
