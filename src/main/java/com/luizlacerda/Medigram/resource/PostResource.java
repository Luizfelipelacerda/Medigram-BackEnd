package com.luizlacerda.Medigram.resource;

import com.luizlacerda.Medigram.model.Post;
import com.luizlacerda.Medigram.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/post")
public class PostResource {

    private final PostService postService;

    public PostResource(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Post>> getAllPosts(){
        Optional<List<Post>> posts = postService.findAllPosts();
        if(posts.isPresent()){
            return new ResponseEntity<>(posts.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/find/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable("id") long id){
        Optional<Post> post = postService.findPostById(id);
        if(post.isPresent()){
            return new ResponseEntity<>(post.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/find/{idUser}")
    public ResponseEntity<List<Post>> getPostByIdUser(@PathVariable("idUser") long idUser){
        Optional<List<Post>> posts = postService.findPostByidUser(idUser);
        if(posts.isPresent()){
            return new ResponseEntity<>(posts.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<Post> addPost(@RequestBody Post post){
        Optional<Post> newPost = postService.addPost(post);
        if(newPost.isPresent()){
            return new ResponseEntity<>(newPost.get(), HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<Post> updatePost(@RequestBody Post post){
        Optional<Post> updatedPost = postService.updatePost(post);
        if(updatedPost.isPresent()){
            return new ResponseEntity<>(updatedPost.get(), HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Post> deletePost(@PathVariable("id") long id){
        Optional<Post> deletedPost = postService.deletePost(id);
        if(deletedPost.isPresent()){
            return new ResponseEntity<>(deletedPost.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

}
