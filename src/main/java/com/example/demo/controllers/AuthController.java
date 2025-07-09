package com.example.demo.controllers;
import com.example.demo.models.RegisterDetails;
import com.example.demo.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    AuthService authService;
    /// REGISTER
    @GetMapping("/register")
    public List<RegisterDetails> getController(){
        return authService.getService();
    }
    @PostMapping("/register")
    public String addNewUser(@RequestBody RegisterDetails register){

        return authService.addNewService(register);
    }



    @PostMapping("/login")
    public String authPostControllerLogin(@RequestBody RegisterDetails login){
        return authService.authPostLoginService(login);}


}