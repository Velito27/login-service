package com.justin.loginservice.service;


import com.justin.loginservice.entity.Login;
import com.justin.loginservice.repository.LoginRepository;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@Service
public class LoginService {

    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }

    public Login saveLogin(Login login){
        return loginRepository.save(login);
    }

    public List<Login> getAllLogins(){
        return loginRepository.findAll();
    }

    public Optional<Login> getLoginById(Long id){
        return loginRepository.findById(id);
    }

}
