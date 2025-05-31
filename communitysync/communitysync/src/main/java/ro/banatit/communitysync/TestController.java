package ro.banatit.communitysync;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Aplicația rulează corect și este conectată la PostgreSQL!";
    }
}