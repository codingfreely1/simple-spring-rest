package simple.spring.rest.request;

/**
 * Created by Yael on 11/14/16.
 */
public class GetCurrentTimeRequest {
    private String secret;

    public GetCurrentTimeRequest() {
    }

    public GetCurrentTimeRequest(String secret) {
        this.secret = secret;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
