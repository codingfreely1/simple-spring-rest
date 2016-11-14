package simple.spring.rest.response;

import org.joda.time.DateTime;

/**
 * Created by Yael on 11/14/16.
 */
public class GetCurrentTimeResponse extends BaseResponse{
    private DateTime currentTime;

    public GetCurrentTimeResponse() {
    }

    public GetCurrentTimeResponse(int statusCode, DateTime currentTime) {
        super(statusCode);
        this.currentTime = currentTime;
    }

    public DateTime getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(DateTime currentTime) {
        this.currentTime = currentTime;
    }
}
