package com.nineleaps.driodserver.driodserver.controllers;

import com.nineleaps.driodserver.driodserver.exceptions.InvalidCredentialsException;
import com.nineleaps.driodserver.driodserver.models.UserLoginModel;
import com.nineleaps.driodserver.driodserver.models.UserLoginResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class LoginController {

    public static final String USER_NAME = "nineleaps";
    public static final String PASSWORD = "nineleaps";
    public static final String SUCCESS ="success";

    @RequestMapping(path = "/api/login", method = RequestMethod.POST, consumes = "application/json",
            produces = "application/json")
    public UserLoginResponse authenticate(@RequestBody  UserLoginModel userLoginModel){

        if(StringUtils.isEmpty(userLoginModel.getUserName()) ||
                StringUtils.isEmpty(userLoginModel.getPassword())) {
            throw new InvalidCredentialsException("Invalid Credentials");
        }

        if(!userLoginModel.getUserName().equalsIgnoreCase(USER_NAME) ||
                !userLoginModel.getPassword().equalsIgnoreCase(PASSWORD)) {
            throw new InvalidCredentialsException("Invalid Credentials");

        }

        return new UserLoginResponse(SUCCESS, UUID.randomUUID().toString());
    }

}
