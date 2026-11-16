package com.pd.ai.generated.kafka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/time")
    public long getTime(){
        return System.currentTimeMillis();
    }
}
