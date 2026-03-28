package com.justin.loginservice.controller;


import com.justin.loginservice.entity.Login;
import com.justin.loginservice.service.LoginService;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> createLogin(@RequestBody Login login) {
        loginService.saveLogin(login);
        return ResponseEntity.ok("Registrado correctamente");
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
