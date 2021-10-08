package service;

import request.EventRequest;
import request.EventsRequest;
import response.Response;

/**
 * The service class that implements event requests
 */
public class EventService {

    /**
     * Returns the single Event object with the specified ID.
     *
     * @param eventRequest the event request from the client
     * @return an event response containing the event object or an error response
     */
    Response getEvent(EventRequest eventRequest) {
        return null;
    }

    /**
     * Returns ALL events for ALL family members of the current user. The current user is determined from the provided auth token.
     *
     * @param eventsRequest the event request from the client
     * @return an events response containing an array of events or an error response
     */
    Response getEvents(EventsRequest eventsRequest) {
        return null;
    }
}
