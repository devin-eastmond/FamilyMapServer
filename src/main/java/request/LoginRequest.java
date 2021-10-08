package request;

/**
 * URL Path: /user/login
 * Description: Logs in the user and returns an auth token.
 * HTTP Method: POST
 * Auth Token Required: No
 */
public class LoginRequest extends Request {

    /**
     * The username of the user
     */
    private String username;

    /**
     * The password of the user
     */
    private String password;

    /**
     * Creates a login request object
     *
     * @param username the user's username
     * @param password the user's password
     */
    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
