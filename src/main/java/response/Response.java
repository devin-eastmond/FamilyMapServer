package response;

/**
 * The base class for all response (result) classes
 */
abstract public class Response {
    /**
     * Whether the request was successful
     */
    protected boolean success;

    /**
     * Creates a response object
     *
     * @param success whether the request was successful
     */
    public Response(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
