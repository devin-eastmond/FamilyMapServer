package model;

/**
 * A user
 */
public class User {

    /**
     * The unique username
     */
    private String username;

    /**
     * The user's password
     */
    private String password;

    /**
     * The user's email
     */
    private String email;

    /**
     * The user's first name
     */
    private String firstName;

    /**
     * The user's last name
     */
    private String lastName;

    /**
     * The user's gender ('m' or 'f')
     */
    private char gender;

    /**
     * The person instance associated with the user
     */
    private Person person;

    /**
     * Creates a new user
     *
     * @param username the user's username
     * @param password the user's password
     * @param email the user's email
     * @param firstName the user's first name
     * @param lastName the user's last name
     * @param gender the user's gender
     * @param person the person associated with the user
     */
    public User(String username, String password, String email, String firstName, String lastName, char gender, Person person) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.person = person;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
