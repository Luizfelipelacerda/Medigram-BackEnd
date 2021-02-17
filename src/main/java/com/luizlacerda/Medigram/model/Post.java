package com.luizlacerda.Medigram.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String postImageUrl;
    @Column(nullable = false, updatable = false)
    private long idUser;

    public Post(String postImageUrl, long idUser) {
        this.postImageUrl = postImageUrl;
        this.idUser = idUser;
    }

}
