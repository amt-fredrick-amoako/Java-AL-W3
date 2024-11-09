package com.amalitech.commentservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {

    @PostMapping
    public ResponseEntity<String> addComment(@RequestBody Map<String, String> comment) {
        return ResponseEntity.ok("Comment added successfully!");
    }

    @GetMapping("/{commentId}")
    public ResponseEntity<String> getComment(@PathVariable String commentId) {
        return ResponseEntity.ok("Details of commentId: " + commentId);
    }

    @GetMapping
    public ResponseEntity<String> getCommentsForPost(@RequestParam String postId) {
        return ResponseEntity.ok("All comments for postId: " + postId);
    }

    @PutMapping("/{commentId}")
    public ResponseEntity<String> editComment(@PathVariable String commentId, @RequestBody Map<String, String> commentDetails) {
        return ResponseEntity.ok("Comment updated successfully for commentId: " + commentId);
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<String> deleteComment(@PathVariable String commentId) {
        return ResponseEntity.ok("Comment deleted successfully for commentId: " + commentId);
    }
}

