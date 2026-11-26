package com.maab.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maab.curso.springboot.webapp.springboot_web.models.User;

@RestController
@RequestMapping("/api")// ruta de primer nivel
public class UserRestController {

@GetMapping("/details")
public Map<String,Object> details(){

    User user = new User("miguel","ancapan");
    Map<String, Object> body = new HashMap<>();

    body.put("tittle", "hola mundo Spring boot");
    body.put("name", user);
    return body;
}




}
