package request;

import model.Event;
import model.Person;
import model.User;

import java.util.List;

/**
 * URL Path: /load
 * Description: Clears all data from the database (just like the /clear API), and then loads the posted user, person, and event data into the database.
 * HTTP Method: POST
 * Auth Token Required: No
 */
public class LoadRequest extends Request {

    /**
     * An array of users to be created
     */
    private List<User> users;

    /**
     * The persons related to the users
     */
    private List<Person> persons;

    /**
     * The events associated with the persons related to the users
     */
    private List<Event> events;

    /**
     * Creates a load request object
     *
     * @param users the user to be created
     * @param persons the persons related to the users
     * @param events the events associated with the persons related to the users
     */
    public LoadRequest(List<User> users, List<Person> persons, List<Event> events) {
        this.users = users;
        this.persons = persons;
        this.events = events;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
