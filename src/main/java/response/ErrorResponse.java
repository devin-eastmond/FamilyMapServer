package response;

/**
 * The response that is returned from any request when an error occurs
 */
public class ErrorResponse extends Response {

    /**
     * The response's error message
     */
    private String errorMessage;

    /**
     * Creates an error response object
     *
     * @param errorMessage the error message
     */
    public ErrorResponse(String errorMessage) {
        super(false);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
