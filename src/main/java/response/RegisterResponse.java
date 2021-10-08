package response;

/**
 * The response returned from register requests
 */
public class RegisterResponse extends Response {

    /**
     * The newly generated authorization token
     */
    private String authToken;

    /**
     * The username of the user
     */
    private String username;

    /**
     * The id of the person associated with the user
     */
    private String personId;

    /**
     * Creates a register response object
     *
     * @param authToken the user's auth token
     * @param username the user's username
     * @param personId the id of the person associated with the user
     */
    public RegisterResponse(String authToken, String username, String personId) {
        super(true);
        this.authToken = authToken;
        this.username = username;
        this.personId = personId;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }
}
