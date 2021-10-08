package response;

/**
 * The response returned from an event request
 */
public class EventResponse extends Response {

    /**
     * Username of the user account this event belongs to (not-empty string)
     */
    private String associatedUsername;

    /**
     * Event's unique ID (not-empty string)
     */
    private String eventId;

    /**
     * ID of the person this event belongs to (not-empty string)
     */
    private String personId;

    /**
     * Latitude of the event's location (number)
     */
    private float latitude;

    /**
     * Longitude of the event's location (number)
     */
    private float longitude;

    /**
     * Name of the country where the event occurred (not-empty string)
     */
    private String country;

    /**
     * Name of the city where the event occurred (not-empty string)
     */
    private String city;

    /**
     * Type of event ("birth", "baptism", etc.) (not-empty string)
     */
    private String eventType;

    /**
     * The year the event occurred (integer)
     */
    private int year;

    /**
     * Creates an event response object
     *
     * @param associatedUsername the username of the user account
     * @param eventId the event's id
     * @param personId the id of the person who owns this event
     * @param latitude the event's latitude
     * @param longitude the event's longitude
     * @param country the event's country
     * @param city the event's city
     * @param eventType the event's type
     * @param year the event's year
     */
    public EventResponse(String associatedUsername, String eventId, String personId, float latitude, float longitude, String country, String city, String eventType, int year) {
        super(true);
        this.associatedUsername = associatedUsername;
        this.eventId = eventId;
        this.personId = personId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
        this.city = city;
        this.eventType = eventType;
        this.year = year;
    }

    public String getAssociatedUsername() {
        return associatedUsername;
    }

    public void setAssociatedUsername(String associatedUsername) {
        this.associatedUsername = associatedUsername;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
