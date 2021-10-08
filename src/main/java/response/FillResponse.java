package response;

/**
 * The response returned from the fill request
 */
public class FillResponse extends Response {

    /**
     * The response success message
     */
    private String message;

    /**
     * Creates a fill response object
     *
     * @param message the success message
     */
    public FillResponse(String message) {
        super(true);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
