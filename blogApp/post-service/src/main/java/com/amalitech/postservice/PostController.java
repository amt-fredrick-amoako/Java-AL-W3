package com.amalitech.postservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    @PostMapping
    public ResponseEntity<String> createPost(@RequestBody Map<String, String> post) {
        return ResponseEntity.ok("Post created successfully!");
    }

    @GetMapping("/{postId}")
    public ResponseEntity<String> getPost(@PathVariable String postId) {
        return ResponseEntity.ok("Details of postId: " + postId);
    }

    @PutMapping("/{postId}")
    public ResponseEntity<String> updatePost(@PathVariable String postId, @RequestBody Map<String, String> postDetails) {
        return ResponseEntity.ok("Post updated successfully for postId: " + postId);
    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<String> deletePost(@PathVariable String postId) {
        return ResponseEntity.ok("Post deleted successfully for postId: " + postId);
    }

    @GetMapping
    public ResponseEntity<String> getUserPosts(@RequestParam String userId) {
        return ResponseEntity.ok("All posts for userId: " + userId);
    }
}

