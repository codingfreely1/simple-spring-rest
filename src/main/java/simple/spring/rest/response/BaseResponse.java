package simple.spring.rest.response;

/**
 * Created by Yael on 11/14/16.
 */
public class BaseResponse {
    public static final int SUCCESS = 0;
    public static final int FAILURE = -1;

    private int statusCode;

    public BaseResponse() {
    }

    public BaseResponse(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
