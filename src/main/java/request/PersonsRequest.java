package request;

/**
 * URL Path: /person
 * Description: Returns ALL family members of the current user. The current user is determined from the provided auth token.
 * HTTP Method: GET
 * Auth Token Required: Yes
 */
public class PersonsRequest {

    /**
     * The authorization token of the user
     */
    private String authToken;

    /**
     * Creates a persons request object
     *
     * @param authToken the user's auth token
     */
    public PersonsRequest(String authToken) {
        this.authToken = authToken;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
