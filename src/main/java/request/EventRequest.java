package request;

/**
 * URL Path: /event/[eventID]
 * Example: /event/251837d7
 * Description: Returns the single Event object with the specified ID.
 * HTTP Method: GET
 * Auth Token Required: Yes
 */
public class EventRequest extends Request {

    /**
     * The id of the event
     */
    private String eventId;

    /**
     * The authorization token of the user
     */
    private String authToken;

    /**
     * Creates an event request object
     *
     * @param eventId the id of the event
     */
    public EventRequest(String eventId) {
        this.eventId = eventId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
