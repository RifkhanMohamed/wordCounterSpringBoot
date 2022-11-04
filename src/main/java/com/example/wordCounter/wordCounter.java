package com.example.wordCounter;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/countWord")
public class wordCounter {
    @PostMapping
    public String countWords(@RequestBody String sentence){
        return String.format("'%s' has %d words",sentence,sentence.split(" ").length);
    }
}
