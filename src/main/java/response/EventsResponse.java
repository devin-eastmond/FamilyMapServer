package response;

import model.Event;

import java.util.List;

/**
 * The response returned from an events request
 */
public class EventsResponse extends Response {
    /**
     * List of event objects
     */
    List<Event> data;

    /**
     * Creates an events response object
     *
     * @param data the list of event objects
     */
    public EventsResponse(List<Event> data) {
        super(true);
        this.data = data;
    }

    public List<Event> getData() {
        return data;
    }

    public void setData(List<Event> data) {
        this.data = data;
    }
}
