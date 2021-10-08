package request;

/**
 * URL Path: /user/register
 * Description: Creates a new user account, generates 4 generations of ancestor data for the new user, logs the user in, and returns an auth token.
 * HTTP method: POST
 * Auth Token Required: No
 */
public class RegisterRequest extends Request {
    /**
     * Username of new user
     */
    private String username;

    /**
     * Password of new user
     */
    private String password;

    /**
     * Email of new user
     */
    private String email;

    /**
     * First name of new user
     */
    private String firstName;

    /**
     * Last name of new user
     */
    private String lastName;

    /**
     * Gender of new user ('m' or 'f')
     */
    private char gender;

    /**
     * Creates a register request object
     *
     * @param username the user's username
     * @param password the user's password
     * @param email the user's email
     * @param firstName the user's first name
     * @param lastName the user's last name
     * @param gender the user's gender
     */
    public RegisterRequest(String username, String password, String email, String firstName, String lastName, char gender) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
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
}
