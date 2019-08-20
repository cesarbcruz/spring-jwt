package com.app.controllers;

import java.security.Principal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping("/exemplo")
    @ResponseBody
    public String getExample(Principal principal) {
        return "Quem fez a requisição é o usuário: " + principal.getName();
    }
}
