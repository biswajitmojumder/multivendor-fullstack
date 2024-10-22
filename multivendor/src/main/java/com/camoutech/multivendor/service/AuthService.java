package com.camoutech.multivendor.service;

import com.camoutech.multivendor.domain.USER_ROLE;
import com.camoutech.multivendor.request.LoginRequest;
import com.camoutech.multivendor.response.AuthResponse;
import com.camoutech.multivendor.response.SignupRequest;

public interface AuthService {

    void sentLoginOtp(String email, USER_ROLE role) throws Exception;
    String createUser(SignupRequest req) throws Exception;
    AuthResponse signin(LoginRequest req) throws Exception;
}
