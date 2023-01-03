package com.example.demo.service;

import com.example.demo.constant.AppConstant;
import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Optional;


@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    TokenService tokenService;

    @Override
    public User saveUser(User user) {
        log.info("Going to save Users..");
        return userRepository.save(user);
    }

    public LoginResponse loginUser(LoginRequest loginRequest) throws IOException {
        String success = "Invalid User";
        String token = null;
        Optional<User> userByEmailFromDb = userRepository.findByEmail(loginRequest.getUsername());
        if(userByEmailFromDb.isPresent())
        {
            String password = userByEmailFromDb.get().getPassword();
            if(loginRequest.getPassword().equals(password))
            {
                token = tokenService.getToken();
                success  = "Valid User";
            }
        }
        return LoginResponse.builder()
                .message(success)
                .token(token)
                .build();
    }

    // cart-service communicate
    public User getUserDetails(Long id) {
        User dbUser = userRepository.findById(id).get();
        User newUser = new User();
        newUser.setFirstName(dbUser.getFirstName());
        newUser.setLastName(dbUser.getLastName());
        newUser.setEmail(dbUser.getEmail());
        newUser.setRole(dbUser.getRole());
        newUser.setPassword(dbUser.getPassword());
        newUser.setMobile(dbUser.getMobile());
        newUser.setId(dbUser.getId());
        newUser.setCreatedAt(dbUser.getCreatedAt());
        newUser.setUpdatedAt(dbUser.getUpdatedAt());
        return newUser;
    }

}