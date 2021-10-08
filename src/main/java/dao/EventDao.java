package dao;

import model.Event;

import java.sql.Connection;
import java.util.List;

/**
 * The data access object for events
 */
public class EventDao {

    /**
     * The connection to the database
     */
    private final Connection connection;

    /**
     * Creates an event DAO
     *
     * @param connection the connection to the database
     */
    public EventDao(Connection connection) {
        this.connection = connection;
    }

    /**
     * Creates an event object in the database
     *
     * @param event the event object
     */
    void createEvent(Event event) {

    }

    /**
     * Returns an event from the database based on a given id
     *
     * @param eventId the id of the event
     * @return the event associated with the id
     */
    Event findEventById(String eventId) {
        return null;
    }

    /**
     * Returns a list of all the events associated with a given user id
     *
     * @param userId the id of the user
     * @return a list of all the events associated with the user
     */
    List<Event> findEventByUserId(String userId) {
        return null;
    }
}
