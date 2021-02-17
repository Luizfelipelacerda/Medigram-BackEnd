package com.luizlacerda.Medigram.service;

import com.luizlacerda.Medigram.model.Post;
import com.luizlacerda.Medigram.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Optional<List<Post>> findAllPosts() {
        return Optional.ofNullable(postRepository.findAll());
    }

    public Optional<Post> findPostById(long id) {
        return postRepository.findById(id);
    }

    public Optional<List<Post>> findPostByidUser(long idUser) {
        return postRepository.findPostByIdUser(idUser);
    }

    public Optional<Post> addPost(Post post) {
        return Optional.ofNullable(postRepository.save(post));
    }

    public Optional<Post> updatePost(Post post) {
        return Optional.ofNullable(postRepository.save(post));
    }

    public Optional<Post> deletePost(long id) {
        Optional<Post> deletedPost = postRepository.findById(id);
        if(deletedPost.isPresent()){
            postRepository.deleteById(id);
            return Optional.of(deletedPost.get());
        }else{
            return null;
        }

    }
}
