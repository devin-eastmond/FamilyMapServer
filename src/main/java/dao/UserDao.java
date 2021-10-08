package dao;

import model.User;

import java.sql.Connection;

/**
 * The data access object for users
 */
public class UserDao {

    /**
     * The connection to the database
     */
    private final Connection connection;

    /**
     * Creates a user DAO
     *
     * @param connection the connection to the database
     */
    public UserDao(Connection connection) {
        this.connection = connection;
    }

    /**
     * Creates a user in the database
     *
     * @param user the user to create
     */
    void createUser(User user) {

    }

    /**
     * Validates the credentials (username and password) of a user
     *
     * @param username the user's username
     * @param password the user's password
     * @return true if the username exists and the password is associated with it
     */
    boolean validateUser(String username, String password) {
        return false;
    }

    /**
     * Returns a user from the database based on a given id
     *
     * @param id the id of the user
     * @return the user associated with the id
     */
    User getUserById (String id) {
        return null;
    }

    /**
     * Removes all users from the database
     */
    void clearUsers() {

    }
}
