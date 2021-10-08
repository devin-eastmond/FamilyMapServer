package request;

/**
 * URL Path: /person/[personID]
 * Example: /person/7255e93e
 * Description: Returns the single Person object with the specified ID.
 * HTTP Method: GET
 * Auth Token Required: Yes
 */
public class PersonRequest extends Request {

    /**
     * The id of the person object
     */
    private String personId;

    /**
     * The user's authorization token
     */
    private String authToken;


    /**
     * Creates a person request object
     *
     * @param personId the person's id
     * @param authToken the user's auth token
     */
    public PersonRequest(String personId, String authToken) {
        this.personId = personId;
        this.authToken = authToken;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
