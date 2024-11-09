package com.amalitech.userservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Map<String, String> user) {
        return ResponseEntity.ok("User registered successfully!");
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody Map<String, String> credentials) {
        return ResponseEntity.ok("User logged in successfully!");
    }

    @GetMapping("/{userId}")
    public ResponseEntity<String> getUserProfile(@PathVariable String userId) {
        return ResponseEntity.ok("User profile for userId: " + userId);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<String> updateUserProfile(@PathVariable String userId, @RequestBody Map<String, String> userDetails) {
        return ResponseEntity.ok("User profile updated for userId: " + userId);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable String userId) {
        return ResponseEntity.ok("User deleted successfully for userId: " + userId);
    }
}

