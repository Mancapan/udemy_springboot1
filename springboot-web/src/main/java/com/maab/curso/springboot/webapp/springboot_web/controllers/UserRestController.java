package com.maab.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maab.curso.springboot.webapp.springboot_web.models.User;
import com.maab.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")// ruta de primer nivel

public class UserRestController {

@GetMapping("/details")

public UserDto details(){
UserDto userDto = new UserDto();
User user = new User("carlos","pinganilla");
userDto.setUser(user);   
userDto.setTittle("hola mundo Spring boot");

return  userDto;
}

// No retorna objeto userDto; retorna Map
@GetMapping("/details-map")
public Map<String,Object> detailsMap(){

    User user = new User("miguel","ancapan");
    Map<String, Object> body = new HashMap<>();

    body.put("tittle", "hola mundo Spring boot");
    body.put("name", user);
    return body;
}

@GetMapping("/list") 
public List<User> list(){
    
User user = new User("carlos","asicalao");
User user1 = new User("pedro","afianzao");
User user2 = new User("matias","perkineitor");

List <User> users = new ArrayList<>();
users.add(user);
users.add(user1);
users.add(user2);

return users;
}







}
