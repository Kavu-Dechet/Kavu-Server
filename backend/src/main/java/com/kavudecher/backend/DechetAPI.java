package com.kavudecher.backend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dechets")
public class DechetAPI {

    @GetMapping("/test")
    public String sayHello() {
        return "Hello from Kavu Project";
    }

    @PostMapping("/1")
    public void postDechet1(@RequestBody String dechet) {
        System.out.println("posting" + dechet);
    }

    @PostMapping("/2")
    public void postDechet2(@RequestBody String category, String latitude, String longitude) {
        System.out.printf("posting %s %s %s", category, latitude, longitude );
    }


    @PostMapping("/3")
    public void postDechet3(@RequestBody String category, String latitude, String longitude) {
        System.out.println("posting  "+ category + " on ("+latitude + ", " + longitude + ")" );
    }

}
