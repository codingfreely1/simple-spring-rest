package simple.spring.rest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import simple.spring.rest.model.Greeting;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Yael on 11/14/16.
 */
@RestController
public class TestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /**
     * host:port/simple_greeting?name=MY_NAME
     * @param name
     * @return
     */
    @RequestMapping("/simple_greeting")
    public String simpleGreeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello " + name;
    }

    /**
     * host:port/greeting?name=MY_NAME
     * @param name
     * @return
     */
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
