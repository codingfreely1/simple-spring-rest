package simple.spring.rest.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import simple.spring.rest.logic.TimeUtil;
import simple.spring.rest.model.Greeting;
import simple.spring.rest.request.GetCurrentTimeRequest;
import simple.spring.rest.response.BaseResponse;
import simple.spring.rest.response.GetCurrentTimeResponse;

/**
 * Created by Yael on 11/14/16.
 */
@RestController
public class TimeController {

    @Autowired
    private TimeUtil mTimeUtil;

    /**
     * localhost:8090/api/1.1.1/getCurrentTime
     * {
     *  "secret" :"please"
     * }
     * @param version
     * @param request
     * @return
     */
    @RequestMapping(value = "/api/{version}/getCurrentTime", method = RequestMethod.POST)
    public GetCurrentTimeResponse getSessionStatusType(@PathVariable String version,
                                                          @RequestBody final GetCurrentTimeRequest request)  {
        if(request.getSecret().equals("please")) {
            return new GetCurrentTimeResponse(BaseResponse.SUCCESS, mTimeUtil.getCurrentTime());
        }
        return new GetCurrentTimeResponse(BaseResponse.FAILURE, null);
    }
}
