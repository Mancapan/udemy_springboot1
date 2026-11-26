package com.maab.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.maab.curso.springboot.webapp.springboot_web.models.User;

@Controller 
public class UserController {

@GetMapping("/details")
public String details(Model model){

User user = new User("miguel", "vidal");
user.setEmail("lancer@gmail.com");

model.addAttribute("tittle", "hola mundo Spring boot");
model.addAttribute("user",user);

return "details";

}

@GetMapping("/list")
public String list(ModelMap model){
List <User> users = new ArrayList<>();
model.addAttribute("users",users);
model.addAttribute("tittle","Listado de Usuarios");

return "list";
}



}
