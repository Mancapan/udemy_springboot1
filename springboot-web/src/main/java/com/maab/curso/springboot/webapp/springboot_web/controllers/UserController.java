package com.maab.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
    model.addAttribute("tittle","Listado de Usuarios");
    return "list";
}


@ModelAttribute("users")
public List<User> usersModel (){
    return Arrays.asList(
        new User("Carlos","Gonzáles"),
        new User("Lalo","Perez","lalo@gmail.com"),
        new User("Victor","nashy"),
        new User("Cristobal","Aranda","cris@hotmail.com")
        );
}






}
