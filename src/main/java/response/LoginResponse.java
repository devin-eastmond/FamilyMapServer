package response;

/**
 * The response returned from the login request
 */
public class LoginResponse extends Response {

    /**
     * Non-empty auth token string
     */
    private String authToken;

    /**
     * Username passed in with request
     */
    private String username;

    /**
     * Non-empty string containing the Person ID of the user's generated Person object
     */
    private String personId;

    /**
     * Creates a login response object
     *
     * @param authToken the auth token string
     * @param username the username passed in with request
     * @param personId the Person ID of the generated Person object
     */
    public LoginResponse(String authToken, String username, String personId) {
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
