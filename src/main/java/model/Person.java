package model;

/**
 * A person
 */
public class Person {

    /**
     * The unique id
     */
    private String id;

    /**
     * The user this person belongs to
     */
    private User user;

    /**
     * The person's first name
     */
    private String firstName;

    /**
     * The person's last name
     */
    private String lastName;

    /**
     * The person's gender ('m' or 'f')
     */
    private char gender;

    /**
     * The person's father
     */
    private Person father;

    /**
     * The person's mother
     */
    private Person mother;

    /**
     * The person's spouse
     */
    private Person spouse;

    /**
     * Creates a new person
     *
     * @param id the unique id
     * @param user the user to whom this person belongs
     * @param firstName the person's first name
     * @param lastName the person's last name
     * @param gender the person's gender ('m' or 'f')
     * @param father the peron's father (nullable)
     * @param mother the person's mother (nullable)
     * @param spouse the person's spouse (nullable)
     */
    public Person(String id, User user, String firstName, String lastName, char gender, Person father, Person mother, Person spouse) {
        this.id = id;
        this.user = user;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        this.spouse = spouse;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }
}
