package com.kavudecher.backend;

import com.kavudecher.backend.services.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/dechets")
public class DechetAPI {

    @Autowired
    private FileStorageService fileStorageService;

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
        System.out.printf("posting %s %s %s", category, latitude, longitude);
    }


    @PostMapping("/4")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {

        fileStorageService.storeFile(file);
        return "travail terminé";
    }

}
