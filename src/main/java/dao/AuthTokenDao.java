package dao;

import model.AuthToken;
import model.User;

import java.sql.Connection;

/**
 * The data access object for authorization tokens
 */
public class AuthTokenDao {

    /**
     * The connection to the database
     */
    private final Connection connection;

    /**
     * Creates an authToken DAO
     *
     * @param connection the connection to the database
     */
    public AuthTokenDao(Connection connection) {
        this.connection = connection;
    }

    /**
     * Creates an authorization token in the database
     *
     * @param authToken the unique authorization token
     */
    void createAuthToken(AuthToken authToken) {

    }

    /**
     * Verifies that the authorization token is in the database and matches the given user
     *
     * @param authToken the unique authorization token to check
     * @param user the user associated with the authorization token
     * @return true if the authorization token is valid
     */
    boolean verifyAuthToken(AuthToken authToken, User user) {
        return false;
    }
}
