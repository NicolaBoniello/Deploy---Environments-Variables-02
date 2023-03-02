package co.develhope.environmentvariables2.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @Value("${myCustomEnvs.welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/welcomeMsg")
    public String getWelcome(){
        return  welcomeMsg;
    }
}