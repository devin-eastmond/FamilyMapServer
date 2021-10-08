package response;

/**
 * The response returned from the clear request
 */
public class ClearResponse extends Response {

    /**
     * The response's success message
     */
    private final String message = "Clear succeeded.";

    /**
     * Creates a clear response object
     */
    public ClearResponse() {
        super(true);
    }

    private String getMessage() {
        return message;
    }
}
