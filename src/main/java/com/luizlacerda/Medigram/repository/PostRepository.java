package com.luizlacerda.Medigram.repository;

import com.luizlacerda.Medigram.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post,Long> {

    Optional<List<Post>> findPostByIdUser(long idUser);
}
