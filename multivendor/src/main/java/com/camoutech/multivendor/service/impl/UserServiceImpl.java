/**
 * Created by camoutech
 * Date :16/10/2024
 * Time :01:54
 * Project Name :multivendor
 */

package com.camoutech.multivendor.service.impl;

import com.camoutech.multivendor.config.JwtProvider;
import com.camoutech.multivendor.model.User;
import com.camoutech.multivendor.repository.UserRepository;
import com.camoutech.multivendor.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final JwtProvider jwtProvider;

    @Override
    public User findUserByJwtToken(String jwt) throws Exception {
        String email = jwtProvider.getEmailFromJwtToken(jwt);

        return this.findUserByEmail(email);
    }

    @Override
    public User findUserByEmail(String email) throws Exception {

        User user = userRepository.findByEmail(email);
        if (user == null){
            throw new Exception("user not found with email - "+email);
        }
        return user;
    }
}
