package com.camoutech.multivendor.service;

import com.camoutech.multivendor.model.User;

public interface UserService {

    User findUserByJwtToken(String jwt) throws Exception;
    User findUserByEmail(String email) throws Exception;
}
