package response;

/**
 * The response returned from the person request
 */
public class PersonResponse extends Response {

    /**
     * Name of the user account this person belongs to
     */
    private String associatedUsername;

    /**
     * Person's unique ID
     */
    private String personId;

    /**
     * Person's first name
     */
    private String firstName;

    /**
     * Person's last name
     */
    private String lastName;

    /**
     * Person's gender ('m' or 'f')
     */
    private char gender;

    /**
     * ID of the person's father (optional)
     */
    private String fatherId;

    /**
     * ID of the person's mother (optional)
     */
    private String motherId;

    /**
     * ID of the person's spouse (optional)
     */
    private String spouseId;

    /**
     * Creates a person response object
     *
     * @param associatedUsername name of the user account this person belongs to
     * @param personId person's unique ID
     * @param firstName person's first name
     * @param lastName person's last name
     * @param gender person's gender
     * @param fatherId ID of the person's father (optional)
     * @param motherId ID of the person's mother (optional)
     * @param spouseId ID of the person's spouse (optional)
     */
    public PersonResponse(String associatedUsername, String personId, String firstName, String lastName, char gender, String fatherId, String motherId, String spouseId) {
        super(true);
        this.associatedUsername = associatedUsername;
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.fatherId = fatherId;
        this.motherId = motherId;
        this.spouseId = spouseId;
    }

    public String getAssociatedUsername() {
        return associatedUsername;
    }

    public void setAssociatedUsername(String associatedUsername) {
        this.associatedUsername = associatedUsername;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFatherId() {
        return fatherId;
    }

    public void setFatherId(String fatherId) {
        this.fatherId = fatherId;
    }

    public String getMotherId() {
        return motherId;
    }

    public void setMotherId(String motherId) {
        this.motherId = motherId;
    }

    public String getSpouseId() {
        return spouseId;
    }

    public void setSpouseId(String spouseId) {
        this.spouseId = spouseId;
    }
}
