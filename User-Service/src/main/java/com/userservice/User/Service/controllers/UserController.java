package com.userservice.User.Service.controllers;

import com.userservice.User.Service.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/{userId}")
    public ResponseEntity<UserDTO> getUser(@PathVariable String userId) {
        UserDTO user = new UserDTO(userId, "John Doe");
        return ResponseEntity.ok(user);
    }
}
