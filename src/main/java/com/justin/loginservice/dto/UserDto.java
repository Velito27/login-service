package com.justin.loginservice.dto;

public class UserDto {
    private long id;
    private String username;
    private String email;

    public UserDto(){}

    public UserDto(Long id, String username, String email){
        this.id = id;
        this.email = email;
        this.username = username;
    }

    public Long getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setEmail(String email){
        this.email = email;
    }

}
