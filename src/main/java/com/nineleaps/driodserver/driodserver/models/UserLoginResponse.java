package com.nineleaps.driodserver.driodserver.models;

public class UserLoginResponse {
    public String message;
    public String authToken;

    public UserLoginResponse() {
    }

    public UserLoginResponse(String message, String authToken) {
        this.message = message;
        this.authToken = authToken;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
