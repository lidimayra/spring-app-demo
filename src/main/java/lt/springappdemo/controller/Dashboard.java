package lt.springappdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dashboard {

    @RequestMapping("/generic")
    public String genericDashboard() {
       return "Hello!";
    }

    @RequestMapping("/custom")
    public String customDashboard(@RequestParam(value ="name") String name) {
        return "Welcome " + name + "!";
    }
}
