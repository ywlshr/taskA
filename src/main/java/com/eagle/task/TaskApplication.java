package com.eagle.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TaskApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "My Home!";
    }

    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(TaskApplication.class, args);
    }
}
