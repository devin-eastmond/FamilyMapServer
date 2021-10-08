package model;

/**
 * An authorization token
 */
public class AuthToken {

    /**
     * The unique token
     */
    private String token;

    /**
     * The user with whom the token is associated
     */
    private User user;

    /**
     * Creates an authorization token
     *
     * @param token the unique token
     * @param user the user associated with the token
     */
    public AuthToken(String token, User user) {
        this.token = token;
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
