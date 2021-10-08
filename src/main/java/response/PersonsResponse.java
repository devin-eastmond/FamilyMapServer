package response;

import model.Person;

import java.util.List;

/**
 * The response returned from persons requests
 */
public class PersonsResponse extends Response {
    /**
     * The list of persons to return in the response
     */
    List<Person> data;

    /**
     * Creates a persons response object
     *
     * @param data the list of all family members associated with the user
     */
    public PersonsResponse(List<Person> data) {
        super(true);
        this.data = data;
    }

    public List<Person> getData() {
        return data;
    }

    public void setData(List<Person> data) {
        this.data = data;
    }
}
