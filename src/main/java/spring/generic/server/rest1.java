package spring.generic.server;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gadiel on 11/10/2016.
 */
@RestController
@RequestMapping("/greeting")
public class rest1 {

    @Secured("ROLE_ADMIN")
    @RequestMapping(value ="/sayHi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hi "+name;
        //example: http://localhost:8080/greeting/sayHi/?name=ido
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "sayHello/{name}", method = RequestMethod.GET)
    String readBookmark(@PathVariable String name) {
        return "hello "+name;
        //example: http://localhost:8080/greeting/sayHello/ido
    }


}
