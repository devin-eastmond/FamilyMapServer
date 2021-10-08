package request;

/**
 * URL Path: /event
 * Description: Returns ALL events for ALL family members of the current user. The current user is determined from the provided auth token.
 * HTTP Method: GET
 * Auth Token Required: Yes
 * Request Body: None
 */
public class EventsRequest extends Request {

    /**
     * The authorization token of the user
     */
    private String authToken;

    /**
     * Creates an events request object
     *
     * @param authToken the user's auth token
     */
    public EventsRequest(String authToken) {
        this.authToken = authToken;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
