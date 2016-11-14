package simple.spring.rest.logic;

import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

/**
 * Created by Yael on 11/14/16.
 */
@Service
public class TimeUtil {

    public DateTime getCurrentTime(){
        return DateTime.now();
    }
}
