package dao;

import model.Person;

import java.sql.Connection;

/**
 * The data access object for persons
 */
public class PersonDao {

    /**
     * The connection to the database
     */
    private final Connection connection;

    /**
     * Creates a person DAO
     *
     * @param connection the connection to the database
     */
    public PersonDao(Connection connection) {
        this.connection = connection;
    }

    /**
     * Creates a person in the database
     *
     * @param person the person to create
     */
    void createPerson(Person person) {

    }

    /**
     * Returns a person from the database based on a given id
     *
     * @param id the id of the person
     * @return the person associated with the id
     */
    Person findPersonById(String id) {
        return null;
    }
}
