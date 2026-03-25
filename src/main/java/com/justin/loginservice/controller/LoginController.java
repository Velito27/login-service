package com.justin.loginservice.controller;


import com.justin.loginservice.entity.Login;
import com.justin.loginservice.service.LoginService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }

    @PostMapping
    public Login createLogin(@RequestBody Login login){
        return loginService.saveLogin(login);
    }

    @GetMapping
    public List<Login> getAllLogins(){
        return loginService.getAllLogins();
    }

    @GetMapping("/{id}")
    public Optional<Login> getLoginById(@PathVariable Long id){
        return loginService.getLoginById(id);
    }

}
