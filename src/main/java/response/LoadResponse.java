package response;

/**
 * The response returned from the load request
 */
public class LoadResponse extends Response {

    /**
     * The response success message
     */
    private String message;

    /**
     * Creates a load response
     *
     * @param message the response message
     */
    public LoadResponse(String message) {
        super(false);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
