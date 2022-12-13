package com.project.controller;

import com.project.reponse.LoginReponse;
import com.project.reponse.ProfileReponse;
import com.project.request.UserRequest;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user/login")
    public LoginReponse login(@RequestHeader String username, @RequestHeader String password){
        return userService.login(username, password);
    }

    @PutMapping("user/register")
    public LoginReponse register(@RequestBody UserRequest user){
        return userService.register(user);
    }

    @GetMapping("user/profile")
    public ProfileReponse profile(@Param("id") int id){
        return new ProfileReponse();
    }

    @GetMapping("")
    public boolean ff(){
        return true;
    }

    @PostMapping("user/edit")
    public ProfileReponse editProfile(@RequestBody ProfileReponse user){
        return new ProfileReponse();
    }

    @PostMapping("user/edit-password")
    public boolean editPassword(@Param("id") int id, @RequestBody String password, @RequestBody String newPassword){
        return true;
    }



}
