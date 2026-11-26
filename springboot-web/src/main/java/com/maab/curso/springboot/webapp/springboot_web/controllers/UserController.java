package com.maab.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.maab.curso.springboot.webapp.springboot_web.models.User;

@Controller 
public class UserController {

@GetMapping("/details")
public String details(Model model){
User user = new User("miguel", "vidal");

model.addAttribute("tittle", "hola mundo Spring boot");
model.addAttribute("user",user);


return "details";

}




}
