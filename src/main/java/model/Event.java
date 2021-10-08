package model;

/**
 * An event
 */
public class Event {

    /**
     * The unique id
     */
    private String id;

    /**
     * The username of the user associated with the event
     */
    private String username;

    /**
     * The latitude of the event
     */
    private float latitude;

    /**
     * The longitude of the event
     */
    private float longitude;

    /**
     * The country of the event
     */
    private String country;

    /**
     * The city of the event
     */
    private String city;

    /**
     * The type of event (e.g. birth, wedding, baptism, etc)
     */
    private String eventType;

    /**
     * The year of the event
     */
    private int year;

    /**
     * Creates a new event
     *
     * @param id the event id
     * @param username the user's username
     * @param latitude the event's latitude
     * @param longitude the event's longitude
     * @param country the event's country
     * @param city the event's city
     * @param eventType the event's type (e.g. birth, wedding)
     * @param year the year of the event
     */
    public Event(String id, String username, float latitude, float longitude, String country, String city, String eventType, int year) {
        this.id = id;
        this.username = username;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
        this.city = city;
        this.eventType = eventType;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
